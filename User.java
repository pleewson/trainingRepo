import java.util.Arrays;

public class User {

    private int id;
    private String fisrtName;
    private String lastName;
    private String books;

    private String[] userLibrary = new String[0];


    //constructors
    User(int id, String firstName, String lastName) {
        this.id = id;
        this.fisrtName = firstName;
        this.lastName = lastName;
    }


    //methods
    public void addBook(Book book) {
        this.userLibrary = Arrays.copyOf(this.userLibrary, this.userLibrary.length + 1);
        this.userLibrary[this.userLibrary.length - 1] = book.toString();
    }


    public void returnBook(Book book) {
        for (int i = 0; i < userLibrary.length; i++) {
            if (userLibrary[i].equals(book.toString())) {
                userLibrary[i] = null;
                return;
            }
        }
        book.setAvilable(true);


    }

    public void returnAllBooks() {
        userLibrary = Arrays.copyOf(userLibrary, 0);

    }

    public void printBorrowedBooks() {
        System.out.println("Your borrowed books: ");
        for (int i = 0; i < userLibrary.length; i++) {
            if (userLibrary[i] == null) {

            } else {
                System.out.println(userLibrary[i]);
            }
        }
    }
}

