public class Start02 {
    public static void main(String[] args) {

        AccessModifier testAttribute = new AccessModifier();

        testAttribute.publicAttribute = 1;
        testAttribute.protectedAttribute = 2;
        testAttribute.deffo = 3;

        System.out.println(testAttribute.deffo);




        System.out.println();


        Persona persona = new Persona();

        persona.setName("Antonio");
        persona.setSurname("Dobryczlek");
        persona.setAge(23);
        persona.setGender('M');

        System.out.println(persona.getName());
        System.out.println(persona.getSurname());
        System.out.println(persona.getAge());
        System.out.println(persona.getGender());

        System.out.println(persona.getFullName());

        persona.increaseAge();

        System.out.println(persona.getAge());

    }
}

