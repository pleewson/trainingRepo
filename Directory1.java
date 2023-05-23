import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Directory1 {
    public static void createDirectory (String directoryName){

        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" + directoryName);

        try{
            if(Files.notExists(path)){
                Files.createDirectory(path);
                System.out.println("created new directory - " + directoryName);
            }else{
                System.out.println(directoryName + " already exist");

            }

        }catch(IOException e){
            System.out.println("we got some problems");
          //  e.printStackTrace();
        }
    }


    public static void createFile (String fileName){
        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/LordFarquaad/" + fileName);

        try{

            if(Files.exists(path)){
                System.out.println(fileName + " already exist");
            }else{
                Files.createFile(path);
                System.out.println("created file - " + fileName);
            }

        }catch (IOException e){
            System.out.println("huston, we got some problems with this file");
           // e.printStackTrace();
        }

    }




    public static void copyFile(String directory, String fileName, String secondFileName){
        Path file1 = Paths.get(directory + "/" + fileName);
        Path file2 = Paths.get(secondFileName);

        try{
            Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING);

            if(Files.exists(file2)){
                System.out.println("Completed copying files.");
            }

        }catch(IOException e){
            System.out.println("error during copying files");
            e.printStackTrace();
        }


    }
}
