import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Files4 {
    public static void main(String[] args){

        File file = new File("/Users/adrianplewa/Desktop/trainingFiles/javaTraining4.txt");
//okey lets go
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if(line.toLowerCase(Locale.ROOT).contains("java")){
                    System.out.println(line);

                }
            }

        }catch (FileNotFoundException ex){
            System.out.println("file error404!@#");

        }
    }
}
