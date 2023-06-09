public class Burger {

    private String size;
    private double price;

    public Burger (String size, double price){
        this.size = size;
        this.price = price;
    }

    public Burger (){
        System.out.println("thaaaaaats best burger bruh");
    }

    public String toString(){
        return "size: " + size + ", price: " + price;
    }
}
