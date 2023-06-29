import java.util.Arrays;

public class StarterPack {
    public static void main(String[] args) {

        Shape shape1 = new Shape(3,4,"pink");
        Shape shape2 = new Shape(2,2,"brown");

        System.out.println(shape1.getDescription());
        System.out.println(shape2.getDescription());

        System.out.println(shape2.getDistance(shape1));

        Circle circle1 = new Circle(4,3,"yellow",6);

        System.out.println(circle1.getDescription());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircuit());


        System.out.println("-------");
        System.out.println();



        Employee emp1 = new Employee(1, "Donathan", "Dushy", 14.20);

        System.out.println(emp1.getWage());


        emp1.raiseWage(20);

        System.out.println(emp1.getWage());




        HourlyEmployee hEmp = new HourlyEmployee(2,"Jacek","Czczicz", 12.30);
        System.out.println(hEmp.calculatePayment(160));

        SalariedEmployee sEmp = new SalariedEmployee(3, "Dominos", "Pitccan", 21);
        sEmp.calculatePayment();



        System.out.println();
        System.out.println("----------------");



        String test = "3";

        AdvancedCalculator adv = new AdvancedCalculator();
        adv.root(25,2);
        adv.add(4,4);
        adv.subtract(5,4);
        adv.subtract(10,3);


        adv.printGlobalOperations();


        System.out.println();
        //------------------------------//
        System.out.println("ShopProduct:");

        Product milk = new Product("Milk 1,5%", 1.09);
        Product bread = new Product("Bread", 2.19);
        Product frozenPizza = new Product("Frozen Pizza", 3.99);
        Product chocolate = new Product("Chocolate", 1.00);

        System.out.println(milk.getPrice());
        System.out.println("milk" + milk.getId());
        System.out.println("bread" + bread.getId());
        System.out.println("pizza" + frozenPizza.getId());


        System.out.println();
        System.out.println("ShoppingCart");
        ShoppingCart cart1 = new ShoppingCart();

        cart1.addProduct(milk,2);
        cart1.addProduct(chocolate, 20);
        cart1.addProduct(frozenPizza, 3);
        cart1.addProduct(chocolate,3);
        cart1.addProduct(chocolate,3);

        cart1.updateProduct(chocolate, 15);

        cart1.removeProduct(chocolate);

        System.out.println();
        cart1.printReceipt();



    }



}
