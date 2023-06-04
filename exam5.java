import java.util.Scanner;

public class exam5 {
    public static double sphere(){
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        double V = (4.0/3.0) * 3.14 * Math.pow(r,3);

        return V;
    }
}
