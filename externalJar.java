import org.apache.commons.lang3.StringUtils;
public class externalJar {
    public static void main(String[] args) {

        String confirmation = "Yes";
        String[] speech = {
                "we",
                "all",
                "in",
                "the",
                "future"
        };

        String palindrom = "kamil slimak";


        System.out.println(reverseString(confirmation));
        System.out.println(toogleChar(confirmation));
        System.out.println(stringFromArray(speech));
        System.out.println(checkPalindrome(palindrom));
    }


    //Task1
    public static String reverseString (String stringToReverse){
        return StringUtils.reverse(stringToReverse);
    }



    //Task2
    public static String toogleChar (String str){
        return StringUtils.swapCase(str);
    }


    //Task3
    public static String stringFromArray(String[] str){
        return StringUtils.join(str," ");
    }




    //Task4
    public static boolean checkPalindrome(String str){
        String str1 = StringUtils.deleteWhitespace(str);

        return str1.equals(StringUtils.reverse(str1));
    }
}
