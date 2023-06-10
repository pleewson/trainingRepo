public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    Author(int id, String firstName, String lastName, String pseudonym){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }

   public String toString(){
        return "id "+ id + " " + firstName + " " + lastName + " " + pseudonym;
    }

}
