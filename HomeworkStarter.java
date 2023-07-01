public class HomeworkStarter {
    public static void main(String[] args) {


        Author tatianaLesterno = new Author(1, "Tatiana", "Lesterno", "latino");
        Author JKRowling = new Author(2, "Joanne Kathleen", "Rowling", "J.K Rowling");




        Book indianaJones = new Book(2, "Indiana Jones dances with monkeys", tatianaLesterno);

        System.out.println(indianaJones.getAuthor());

        SoundBook sbHarryPotter1 = new SoundBook(2, "Harry Potter and the philisopher's stone", JKRowling, 6.48, 7);
        SoundBook sbHobbit = new SoundBook(3, "Hobbit", tatianaLesterno, 3.23, 3);

        sbHarryPotter1.borrowBook();
        sbHarryPotter1.borrowBook();
        sbHarryPotter1.borrowBook();
        sbHarryPotter1.borrowBook();

        System.out.println("borrowed copies: " + sbHarryPotter1.getPopularity());
        System.out.println("borrowed copies: " + sbHobbit.getPopularity());

        System.out.println(sbHarryPotter1.equals(indianaJones));


        User kamil = new User(3,"Kamil", "Bednarek");

        kamil.addBook(indianaJones);
        kamil.addBook(sbHobbit);

        kamil.printBorrowedBooks();
        kamil.returnBook(indianaJones);

        System.out.println();
        kamil.printBorrowedBooks();

        System.out.println();
        kamil.returnAllBooks();
        kamil.addBook(sbHarryPotter1);
        kamil.printBorrowedBooks();


        System.out.println();
        double valueOfDouble = 2d;

        int valueOfInt = (int) 2;

        System.out.println(valueOfInt);
    }
}
