public class Car {

    private String brand;
    private String model;
    private double price;

    public Car setBrand(String brand){
        this.brand = brand;
        return this;
    }

    public Car setModel(String model){
        this.model = model;
        return this;
    }

    public Car setPrice(double price){
        this.price = price;
        return this;
    }



    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public double getPrice() {return price;}



    public String toString(){
        return model + " " + price;
    }
}


