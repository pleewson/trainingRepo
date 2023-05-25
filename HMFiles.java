import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HMFiles {
    public static void main(String[] args) throws IOException{

    //   System.out.println(count("/Users/adrianplewa/Desktop/trainingFiles/numbers.txt"));

      //  System.out.println(wordCounter("/Users/adrianplewa/Desktop/trainingFiles/text1.txt"));

         // System.out.println(checkFileExist());

        rewrite();

      /*try (PrintWriter prr = new PrintWriter("/Users/adrianplewa/Desktop/trainingFiles/testertsetstesrtset.txt")){
          prr.println("szegz");
      }catch (IOException e){
          System.out.println("eror");
      }

       */

    }

    //task1
    public static int count(String filename){
        File file1 = new File(filename);
        int counter = 0;

        try {
            Scanner scan = new Scanner(file1);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                counter += line.length();
            }
        }catch (FileNotFoundException ex){
            System.out.println("problems with reading file");
            ex.printStackTrace();
        }

        return counter;
    }



//task2
    public static int wordCounter (String fileName){
        File file1 = new File(fileName);
        StringBuilder sb = new StringBuilder();


        String[] countedWords;

        try{
            Scanner scan = new Scanner(file1);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                sb.append(line);
            }
        }catch (FileNotFoundException ex){
            System.out.println("problems with file");
            ex.printStackTrace();
        }

        String convSb = sb.toString();
        countedWords = convSb.split(" ");

        return countedWords.length;
    }

    //task3
    public static boolean checkFileExist(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name: ");

        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" + scan.nextLine());

        if(Files.exists(path) == true){
            return true;
        }else{
            return false;
        }

    }

//task4
    public static void rewrite() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name: ");

        String fileName = scan.nextLine();

        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" + fileName + ".txt");
        File file = new File("/Users/adrianplewa/Desktop/trainingFiles/" + fileName + ".txt");


        if (Files.exists(path)) {
            try (PrintWriter writer = new PrintWriter("/Users/adrianplewa/Desktop/trainingFiles/" +fileName + "_2.txt")) {
                Scanner scanRead = new Scanner(file);
                while (scanRead.hasNextLine()) {
                    String line = scanRead.nextLine();
                    writer.println(line);
                    writer.println(line);
                }

                System.out.println("Created new file _2");

        }catch(IOException ex){
            System.out.println("problems with file");
            }
        }else{
            System.out.println("files doesnt exist.");
        }
    }
}
