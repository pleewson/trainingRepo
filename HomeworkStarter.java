public class HomeworkStarter {
    public static void main(String[] args) {


        Author tatianaLesterno = new Author(1, "Tatiana", "Lesterno", "latino");
        Author JKRowling = new Author(2, "Joanne Kathleen", "Rowling", "J.K Rowling");


        Book indianaJones = new Book(1, "Indiana Jones dances with monkeys", tatianaLesterno);

        System.out.println(indianaJones.getAuthor());

        SoundBook sbHarryPotter1 = new SoundBook(2, "Harry Potter and the philisopher's stone", JKRowling, 6.48, 7);


        System.out.println(sbHarryPotter1.getDuration() + "h");


    }
}
