public class Start03 {
    public static void main(String[] args) {

        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.gender);


        System.out.println();



        Car newBeetle = new Car();

        newBeetle.setBrand("Volkswagen");
        newBeetle.setModel("New Beetle");
        newBeetle.setPrice(10000);

        System.out.println(newBeetle);



        Author Tolkien = new Author(942, "John", "Tolkien", "J.R.R. Tolkien");

        System.out.println(Tolkien.toString());
    }
}