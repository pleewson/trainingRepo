import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("/Users/adrianplewa/Desktop/trainingFiles/captmidn.txt");

        int nrLine = 1;

        try{
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                String Line = scan.nextLine();
                System.out.println("Line " + nrLine + ": " + Line);
                nrLine++;
            }
            }catch (FileNotFoundException e){
         throw new FileNotFoundException("file error");
//discoboy        }
        }
    }

