
public class Product {

   private int id;
   private String name;
   private double price;

    static int nextId = 1;


    Product(String name, double price){
        this.id = nextId;
        nextId++;
        this.name = name;

        if(price < 0.01){
            throw new IllegalArgumentException("Price must be greater than 0.00");
        }else {
            this.price = price;
        }
    }



    //setters//

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0.01) {
            throw new IllegalArgumentException("Price must be greater than 0.00");
        } else {
            this.price = price;
        }
    }


    //getters//

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getId(){
        return id;
    }
}
