public class PersonaCon {

    private String name;
    private String surname;
    private int age;
    private char gender;

    PersonaCon(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    PersonaCon(String name, int age){
        this.name = name;
        this.age = age;
    }

    PersonaCon(String name, String surname, int age, char gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
