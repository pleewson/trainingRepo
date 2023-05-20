import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files3 {
    public static void main(String[] args){

        File file = new File("/Users/adrianplewa/Desktop/trainingFiles/doubleNums.txt");
        double sum = 0;
try {
    Scanner scan = new Scanner(file);
    String line;
    while(scan.hasNextLine()) {
        line = scan.nextLine();
        String[] values = line.trim().split("\\s*,\\s*");

        for (String value : values) {
            try{
                double num = Double.parseDouble(value);
                sum += num;
                System.out.println(num);
            }catch(NumberFormatException e){
                System.out.println("Value is not double, hence ignored!");
            }
        }
    }
}catch(FileNotFoundException ex){
    System.out.println("file error!@!@");
    }

        System.out.println("sum = " + sum);

    }
}
