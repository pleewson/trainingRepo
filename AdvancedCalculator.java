public class AdvancedCalculator extends Calculator {

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

}
