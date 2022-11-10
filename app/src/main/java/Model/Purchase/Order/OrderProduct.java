package Model.Purchase.Order;

import java.util.ArrayList;
import java.util.List;

public  class OrderProduct {
    static List<ProductEntity> cart = new ArrayList<>();

    public boolean addToCart(ProductEntity product){
        cart.add(product);
        return true;
    }

    public boolean removeAll(){
        //remove everything from the cart
        return true;
    }

    public List<ProductEntity> displayOrder(){
        return cart;
    }
}
