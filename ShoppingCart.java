import java.util.Arrays;

public class ShoppingCart {

    public CartItems[] cartItems = new CartItems[0];

    CartItems newItem;


    //zwieksza ilosc
    public void addProduct(Product product, int quantity) {
        increaseArray();
        CartItems newItem = new CartItems(product,quantity);

        if(newItem.getProduct().equals(product)){
            newItem.setQuantity(newItem.getQuantity()+ quantity);
        }

        for(int i = 0; i < cartItems.length; i++){
            cartItems[i] = newItem;
        }

    }

    //drukuje paragon
    int count = 1;
    public void printReceipt (){
        for(int i = 0; i < cartItems.length; i++){
            System.out.println(count + ": " + cartItems[i].getProduct().getName() + " ID:" + cartItems[i].getProduct().getId() + cartItems[i].getQuantity() + cartItems[i].getProduct().getPrice());
            count++;
        }
    }



    public void increaseArray(){
        cartItems = Arrays.copyOf(cartItems, cartItems.length+1);
        cartItems[cartItems.length-1] = newItem;
    }
}




//  if(items.getProduct().equals(product)){
//              items.setQuantity(items.getQuantity() + quantity);
//          }
