import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

   private static String [] globalHistory = new String[0];


                //computes//
   static final double PI = 3.14159265;
    double pow(double num1, double num2){
        double result = Math.pow(num1,num2);
        addToHistory(num1 + " ^ " + num2 + " equals " + result);
        return result;
    }

    double root(double num1, double num2){
        double result = Math.pow(num1, 1.0 / num2);
        String str = String.format("%.2f", result);
        addToHistory(num2 + " root of " + num1 + " equals " + str);
        return result;
    }



    //this method will not add computes to history because its static method
    static double computeCircleArea(double r){
        double result = PI * Math.pow(r,2);
       addToAdvancedHistory("2 * PI * " + r + "^2 = " + result);
        return result;
    }







    public void printGlobalOperations(){
        printOperations();
        for (String s : globalHistory) {
            System.out.println(s);
        }
    }


    //-----------------------HERE
    public void printGlobalOperations(int length){
        for (int i = 0; i < length; i++){
            System.out.println(globalHistory[i]);
        }
    }


    static void addToAdvancedHistory(String text){
        globalHistory = Arrays.copyOf(globalHistory,+1);
        globalHistory[globalHistory.length-1] = text;
    }




}
