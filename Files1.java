import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files1 {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter text:");

        try (PrintWriter printer = new PrintWriter("/Users/adrianplewa/Desktop/trainingFiles/text1.txt")) {
            while (scan.hasNext()) {
                String text = scan.nextLine();
                if (text.contains("quit")) {
                    break;
                }
                printer.println(text + " ");
            }
        }catch (FileNotFoundException ex){
            System.out.println("file error!!");
        }
    }
}