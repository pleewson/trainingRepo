public class CartItems {

    private Product product;
    private int quantity;


    CartItems(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    //setters//

    public void setProduct(Product product){
        this.product = product;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


    //getters//
    public int getQuantity(){
        return this.quantity;
    }

    public Product getProduct(){
        return this.product;
    }
}
