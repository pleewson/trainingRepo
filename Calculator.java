import java.util.Arrays;

public class Calculator {

   protected String[] history = new String[0];


    double add(double num1, double num2) {
        double result = num1 + num2;
        addToHistory("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }


    double multiply(double num1, double num2){
        double result = num1 * num2;
        addToHistory("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }


    double division(double num1, double num2) throws ArithmeticException{
        if(num2 == 0 ) {
            throw new ArithmeticException("You cant divide by 0.");
        }else{
            double result = num1 / num2;
            addToHistory("divided " + num1 + " by " + num2 + " got " + result);
            return result;
        }
    }



    double subtract(double num1, double num2){
        double result = num1 - num2;
        addToHistory("subtracted " + num2 + " from " + num1 + " got " + result);
        return result;
    }





    protected void addToHistory(String text){
        this.history = Arrays.copyOf(this.history,this.history.length+1);
        this.history[this.history.length-1] = text;
    }


    public void printOperations(){
        for(String h : history){
            System.out.println(h);
        }
    }

    public void clearOperations(){
        this.history = Arrays.copyOf(this.history,0);
    }

    //check
}



