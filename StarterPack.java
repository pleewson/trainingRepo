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

    }
}
