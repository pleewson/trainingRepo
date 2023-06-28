import java.util.Arrays;

public class ShoppingCart {

    public CartItems[] cartItems = new CartItems[0];

    CartItems newItem;

    public void abc(){
        for(int i = 0; i < cartItems.length; i++){
            System.out.println(cartItems[i].getProduct().getName());
        }
    }

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
                cartItems[i] = null;
            }
        }
    }


    //aktualizuje produkt
    public void updateProduct(Product product, int quantity){
        for(int i = 0; i < cartItems.length; i++){
            if (cartItems[i].getProduct().equals(product)){
                cartItems[i].setQuantity(cartItems[i].getQuantity() + quantity);
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
    public int getTotalSum(){
        int totalSum = 0;
        for(int i = 0; i < cartItems.length; i++){
          totalSum += cartItems[i].getProduct().getPrice();
        }

        return totalSum;
    }



    //drukuje paragon
    int count = 1;
    public void printReceipt (){
        for(int i = 0; i < cartItems.length; i++){
            System.out.println(count + ": " + cartItems[i].getProduct().getName() + " ID:" + cartItems[i].getProduct().getId() + "  "
                    + cartItems[i].getQuantity() + "x" + cartItems[i].getProduct().getPrice() + " = " +  (cartItems[i].getQuantity() * cartItems[i].getProduct().getPrice()));
            count++;
        }
    }



    public void increaseArray(){
        cartItems = Arrays.copyOf(cartItems, cartItems.length+1);
    }


}




//  if(items.getProduct().equals(product)){
//              items.setQuantity(items.getQuantity() + quantity);
//          }
