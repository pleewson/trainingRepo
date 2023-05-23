import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory1 {
    public static void createDirectory (String directoryName){

        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" + directoryName);

        try{
            if(Files.notExists(path) == true){
                System.out.println(directoryName + " doesnt exist");
            }else{
                System.out.println(directoryName + " already exist");

            }
            Files.createDirectory(path);
            
        }catch(IOException e){
            System.out.println("we got some problems");
            e.printStackTrace();
        }
    }
}

//Files.exists(directory),