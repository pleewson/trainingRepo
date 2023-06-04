
import java.util.Random;

public class exam3 {

    public static int[] div(int size, int interval) {

        Random rn = new Random();
        int num;

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            while (array[i] == 0) {
                num = rn.nextInt(interval) + 1;
                if ((num % 2 == 0) && (num % 3) != 0) {
                    array[i] = num;
                    break;
                }
            }
        }

        return array;


    }
}
