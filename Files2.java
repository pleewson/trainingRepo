import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/adrianplewa/Desktop/trainingFiles/text1.txt");
        StringBuilder sb = new StringBuilder();
        int nrline = 1;

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                sb.append("line ").append(nrline).append(". ").append(scan.nextLine()).append("\n");
                nrline++;
            }
            System.out.println(sb);
        }catch (FileNotFoundException ex){
            System.out.println("fileerror!!!");
        }
//trappyn

    }
}
