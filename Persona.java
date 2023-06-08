public class Persona {

    private String name;
    private String surname;
    private int age;
    private char gender;

    //SET

    public Persona setName(String name){
        this.name = name;
        return this;
    }

    public Persona setSurname(String surname){
        this.surname = surname;
        return this;
    }

    public Persona setAge(int age){
        this.age = age;
        return this;
    }

    public Persona setGender(char gender){
        this.gender = gender;
        return this;
    }


    public Persona increaseAge(){
        this.age++;
        return this;
    }


//GET
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public String getFullName(){
        return this.name + " " + this.surname;
    }


}


