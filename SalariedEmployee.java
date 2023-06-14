public class SalariedEmployee extends Employee{

    final static int monthlyHours = 190;

    SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }


    void calculatePayment(){
        System.out.println(this.monthlyHours * this.wage);
    }
}
