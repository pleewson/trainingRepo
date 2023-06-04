import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exam8 {
    public static void create(int max){

        double limit = max*0.6;

        Path path = Paths.get("exam.txt");

        try(FileWriter fileWriter = new FileWriter("exam.txt")) {


            Scanner scan = new Scanner(System.in);
            String login;
            int points;

            System.out.println("Enter amout people in group:");
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter login: ");
                login = scan.next();
                System.out.println("Enter amout of points: ");
                points = scan.nextInt();

                fileWriter.append(login).append(" ").append(String.valueOf(points)).append("\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("incorrect input");
        }



        String[] arr = new String[0];
        String[] exam_passedArr = new String[0];
        int g = 0;

        try{
            Scanner reader = new Scanner(path);

            while(reader.hasNext()){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[g] = reader.next();
                g++;
            }

            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < arr.length; i++){
                i++;
                if(Integer.parseInt(arr[i]) >= limit) {
                    exam_passedArr = Arrays.copyOf(exam_passedArr,exam_passedArr.length+2);
                    builder.append(arr[i-1]).append(" ").append(arr[i]).append(" ");
                }
            }

           String examSb = builder.toString();
            exam_passedArr = examSb.split(" ");

        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileWriter fileWriter = new FileWriter("exam_passed.txt")){
            for(int i = 0; i < exam_passedArr.length; i++){
                fileWriter.append(exam_passedArr[i]).append(" ");
                i++;
                fileWriter.append(exam_passedArr[i]).append(" ").append("\n");

            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
