import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Directory1 {
    public static void createDirectory(String directoryName) {

        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" + directoryName);

        try {
            if (Files.notExists(path)) {
                Files.createDirectory(path);
                System.out.println("created new directory - " + directoryName);
            } else {
                System.out.println(directoryName + " already exist");

            }

        } catch (IOException e) {
            System.out.println("we got some problems");
            //  e.printStackTrace();
        }
    }


    public static void createFile(String fileName) {
        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/LordFarquaad/" + fileName);

        try {

            if (Files.exists(path)) {
                System.out.println(fileName + " already exist");
            } else {
                Files.createFile(path);
                System.out.println("created file - " + fileName);
            }

        } catch (IOException e) {
            System.out.println("huston, we got some problems with this file");
            // e.printStackTrace();
        }

    }


    public static void copyFile(String directory, String fileName, String secondFileName) {
        Path file1 = Paths.get(directory + "/" + fileName);
        Path file2 = Paths.get(secondFileName);

        try {
            Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING);

            if (Files.exists(file2)) {
                System.out.println("Completed copying files.");
            }

        } catch (IOException e) {
            System.out.println("error during copying files");
            e.printStackTrace();
        }
    }



    public static void writeToFile(String fileName) {

        Path path = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" + fileName);

        try {
            if (Files.exists(path)) {
                System.out.println(fileName + " - this file already exist.");
            } else {
                Files.createFile(path);
                System.out.println("created new file - " + fileName);
            }
        } catch (IOException e) {
            System.out.println("@@@ problems with creating file @@@");
        }

        List<String> outList = new ArrayList<>();

        System.out.println(" enter your text to file:");
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {
                String line = scan.nextLine();
                if ("quit".equalsIgnoreCase(line)) {
                    break;
                }
                outList.add(line);
                Files.write(path, outList);
            }
        } catch (IOException ex) {
            System.out.println("can't save to file");
        }
    }




    public static void readFromFile (String fileName) {
        Path path1 = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" +fileName + ".txt");
        Path path2 = Paths.get("/Users/adrianplewa/Desktop/trainingFiles/" +fileName + ".html");

        //load
        System.out.println("text: ");
        try{
            for(String line : Files.readAllLines(path1)){
                System.out.println(line);
            }
        }catch (IOException ex){
            System.out.println("@@error with loading file@@");
            ex.printStackTrace();
        }

        //new file
        try{
            Files.createFile(path2); //StandardCopyOption.REPLACE_EXISTING
            System.out.println("+created new file");
        }catch (IOException ex){
            System.out.println("@@error with creating new file@@");
            ex.printStackTrace();
        }

        //converting into html
        List<String> outList = new ArrayList<>();

        try {

            Scanner scan = new Scanner(path1);

            outList.add("<html>");
            outList.add("<body>");

            while(scan.hasNextLine()){
                outList.add("<p>" + scan.nextLine() + "</p>");
            }

            outList.add("</html>");
            outList.add("</body>");

            Files.write(path2, outList);

        }catch (IOException ex){
            System.out.println("@@error with converting into html@@");
            ex.printStackTrace();
        }
    }
}

