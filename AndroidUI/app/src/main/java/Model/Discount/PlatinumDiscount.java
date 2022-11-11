package Model.Discount;

import java.util.ArrayList;

public class PlatinumDiscount implements IDiscountState {
    User user;

    public PlatinumDiscount(User newUser) {
        user = newUser;
    }


    @Override
    public void applyDiscount(ArrayList<Product> cart) {
        // 20% discount
        for(Product product : cart) {
            product.setPrice(product.getPrice() * 0.8);
        }
    }
}
