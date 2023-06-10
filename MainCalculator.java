public class MainCalculator {

    public static void main(String[] args){


        Calculator c = new Calculator();

        try {
            c.division(10, 0);
        }catch (ArithmeticException e){
            System.out.println("cant div by 0.");
        }

        
        c.add(9,4);
        c.subtract(10,5);
        c.division(100, c.multiply(5,5));

        c.printOperations();
        c.clearOperations();
        c.printOperations();









    }
}

