import java.util.Arrays;

public class ShoppingCart {


    public CartItems[] cartItems = new CartItems[0];

    CartItems newItem;


    //zwieksza ilosc
    public void addProduct(Product product, int quantity) {

        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getProduct().equals(product)) {
                cartItems[i].setQuantity(cartItems[i].getQuantity() + quantity);
                return;
            }
        }

            increaseArray();
            CartItems newItem = new CartItems(product, quantity);
            cartItems[cartItems.length - 1] = newItem;


    }

    //usuwa produkt
    public void removeProduct(Product product){
        for(int i = 0; i < cartItems.length; i++){
            if(cartItems[i].getProduct().equals(product)){
                cartItems[i].setQuantity(0);
            }
        }
    }


    //aktualizuje produkt
    public void updateProduct(Product product, int quantity){
        for(int i = 0; i < cartItems.length; i++){
            if (cartItems[i].getProduct().equals(product)){
                cartItems[i].setQuantity(quantity);
            }
        }
    }



    //getter// laczna ilosc produktow
    public int getTotalQuantity(){
        int sumQuantity = 0;
        for(int i = 0; i < cartItems.length; i++){
            sumQuantity += cartItems[i].getQuantity();
        }
        return sumQuantity;
    }


    //getter// laczna wartosc produktow
    public double getTotalSum(){
        double totalSum = 0;
        for(int i = 0; i < cartItems.length; i++){
          totalSum += cartItems[i].getProduct().getPrice() * cartItems[i].getQuantity();
        }

        return totalSum;
    }



    //drukuje paragon
    int count = 1;
    public void printReceipt (){
        for(int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getQuantity() == 0) {

            } else {
                System.out.println(count + ": " + cartItems[i].getProduct().getName() + " ID:" + cartItems[i].getProduct().getId() + "  "
                        + cartItems[i].getQuantity() + "x" + cartItems[i].getProduct().getPrice() + " = " + (cartItems[i].getQuantity() * cartItems[i].getProduct().getPrice()));
                count++;
            }
        }

        System.out.println();
        System.out.println("Total: " + getTotalSum());
    }



    public void increaseArray(){
        cartItems = Arrays.copyOf(cartItems, cartItems.length+1);
    }


}

