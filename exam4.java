import java.util.Scanner;

public class exam4 {

    public static int[] returnTab(){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];

        int count = 1;

        for(int i = 0; i < arr.length; i++){
            arr[i] = count;
            count++;
        }

        return arr;
    }
}
