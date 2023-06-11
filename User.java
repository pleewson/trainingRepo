import java.util.Arrays;

public class User {
    private int id;
    private String fisrtName;
    private String lastName;
    private String books;

    private String[] userLibrary = new String[0];



    User(int id, String firstName, String lastName){
        this.id = id;
        this.fisrtName = firstName;
        this.lastName = lastName;
    }


    public void addBook(Book book){
        this.userLibrary = Arrays.copyOf(this.userLibrary, this.userLibrary.length+1);
        this.userLibrary[-1] = book.toString();

    }
}

