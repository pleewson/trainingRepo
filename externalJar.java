import org.apache.commons.lang3.StringUtils;
public class externalJar {
    public static void main(String[] args) {

        String confirmation = "Yes";
        System.out.println(reverseString(confirmation));
    }

    public static String reverseString (String stringToReverse){
        return StringUtils.reverse(stringToReverse);
    }
}
