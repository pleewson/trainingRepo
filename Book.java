public class Book {

    private int id;
    private String title;
    private boolean avilable = true;
    private Author author;
    private Author[] additionalAuthors;



    Book(int id, String title){
        this.id = id;
        this.title = title;
    }



    Book(int id, String title, Author author){
        this.id = id;
        this.title = title;
        this.author = author;
    }


    Book(int id, String title, Author author, Author[] additionalAuthors){
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }



    //Setters
    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAvilable(boolean avilable){
        this.avilable = avilable;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors){
        this.additionalAuthors = additionalAuthors;
    }


    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean getAvilable(){
        return avilable;
    }

    public Author getAuthor(){
        return author;
    }

    public Author[] getAdditionalAuthors(){
        return additionalAuthors;
    }
}

