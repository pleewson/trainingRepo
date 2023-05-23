import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/kamiszka/" + fileName);

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
}
