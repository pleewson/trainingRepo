
public class exam2 {

    public static String shorten(String str, int length){
        StringBuilder sb = new StringBuilder();

        char[] arr = str.toCharArray();

        for(int i = 0; i < length; i++){
            sb.append(arr[i]);

        }

        return sb.toString();
    }
}
