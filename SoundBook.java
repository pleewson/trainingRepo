public class SoundBook extends Book {

    private double duration = 0.00;
    private int numberOfCarriers;




    SoundBook(int id, String title, Author author, double duration, int numberOfCarriers){
        super(id,title,author);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }






    //setters

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setNumberOfCarriers(int numberOfCarriers){
        this.numberOfCarriers = numberOfCarriers;
    }




    //getters

    public double getDuration(){
        return duration;
    }


    public int getNumberOfCarriers(){
        return numberOfCarriers;
    }



}
