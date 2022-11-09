package Model.Purchase.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderProduct {
    List<ProductEntity> cart = new ArrayList<>();

    public boolean addToCart(ProductEntity product){
        cart.add(product);
        return true;
    }

    public List<ProductEntity> displayOrder(){
        return cart;
    }
}
