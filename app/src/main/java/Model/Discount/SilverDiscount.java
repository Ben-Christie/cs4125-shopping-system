package Model.Discount;

import java.util.ArrayList;

public class SilverDiscount implements IDiscountState {
    User user;

    public SilverDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public void applyDiscount(ArrayList<Product> cart) {
        // 10% discount
        for(Product product : cart) {
            product.setPrice(product.getPrice() * 0.9);
        }
    }
}
