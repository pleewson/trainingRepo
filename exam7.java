public class exam7 {

    public static int countNumbers(String str){

        StringBuilder sb = new StringBuilder();

        int sum = 0;
        char[] strArr = str.toCharArray();

        try {
            for (int i = 0; i < strArr.length; i++) {
                if (Character.isDigit(strArr[i])) {
                    sb.append(strArr[i]).append(",");
                }
            }

            String sss = sb.toString();
            String[] numArr = sss.split(",");

            for (int i = 0; i < numArr.length; i++) {
                sum += Integer.parseInt(numArr[i]);
            }

            return sum;
        }catch (NumberFormatException e){
            return 0;
        }
    }

}
