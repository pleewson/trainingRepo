public class StarterPack {
    public static void main(String[] args) {

        Shape shape1 = new Shape(3,4,"pink");
        Shape shape2 = new Shape(5,6,"brown");

        System.out.println(shape1.getDescription());
        System.out.println(shape2.getDescription());

    }
}
