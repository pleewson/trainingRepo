public class exam6 {

    public static String replaceStr(String str, String forReplace, String replacement){

        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(forReplace)){
                arr[i] = replacement;
            }
            sb.append(arr[i]).append(" ");
        }

        return sb.toString();


    }
}
