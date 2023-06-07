public class Start02 {
    public static void main(String[] args) {

        AccessModifier testAttribute = new AccessModifier();

        testAttribute.publicAttribute = 1;
        testAttribute.protectedAttribute = 2;
        testAttribute.deffo = 3;

        System.out.println(testAttribute.deffo);
    }
}
