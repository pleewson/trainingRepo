public class Employee {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected double wage;


    Employee(int id, String firstName, String lastName, double wage){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

   public void raiseWage(double percent) {
       if (percent == 0) {
           System.out.println("Invalid value.");
       } else {
           double result = (percent / 100) * this.wage;
           this.wage += result;
       }
   }


   public String getWage(){
        return Double.toString(wage);
    }

}
