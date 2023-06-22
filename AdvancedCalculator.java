import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

   private String [] globalHistory = new String[0];

   static final double PI = 3.14159265;
    double pow(double num1, double num2){
        double result = Math.pow(num1,num2);
        addToHistory(num1 + " ^ " + num2 + " equals " + result);
        addToGlobalHistory(num1 + " ^ " + num2 + " equals " + result);
        return result;
    }

    double root(double num1, double num2){
        double result = Math.pow(num1, 1.0 / num2);
        String str = String.format("%.2f", result);
        addToHistory(num2 + " root of " + num1 + " equals " + str);
        addToGlobalHistory(num2 + " root of " + num1 + " equals " + str);
        return result;
    }



    //this method will not add computes to history because its static method
    static double computeCircleArea(double r){
        add
        return PI * Math.pow(r,2);
    }




     static void addToGlobalHistory(String text){
        this.globalHistory = Arrays.copyOf(this.globalHistory,+1);
        this.globalHistory[this.globalHistory.length-1] = text;
    }



   /* static void printGlobalOperations(){
    }
    */

}
