import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    public AdvancedCalculator(){
        System.out.println("advCalc");
    }
   private static String [] globalHistory = new String[0];


                //computes//
    //pow
    //root
    //computeCircleArea
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
        return result;
    }






    //opterations//


    public void printGlobalOperations(){
        for(int i = 0; i < globalHistory.length; i++){
            System.out.println(globalHistory[i]);
        }
    }


    //----------------------overloaded method
    public void printGlobalOperations(int length){
        for (int i = 0; i < length; i++){
            System.out.println(globalHistory[i]);
        }
    }

    //----------------------overloaded method
    public void printGlobalOperations(String length){
        for(int i = 0; i < Integer.parseInt(length); i++){
            System.out.println(globalHistory[i]);
        }
    }




    static void addToGlobaldHistory(String text){
        globalHistory = Arrays.copyOf(globalHistory,globalHistory.length+1);
        globalHistory[globalHistory.length-1] = text;
    }

    protected void addToHistory(String text){
        super.addToHistory(text);
        addToGlobaldHistory(text);

    }



}
