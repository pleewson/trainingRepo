public class HourlyEmployee extends Employee{

    HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    double calculatePayment(double hours){
       return hours * this.wage;
    }

}
