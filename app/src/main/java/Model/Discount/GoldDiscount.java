package Model.Discount;

import java.util.ArrayList;

public class GoldDiscount implements IDiscountState {
    User user;

    public GoldDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public void applyDiscount(ArrayList<Product> cart) {
        // 15% discount
        for(Product product : cart) {
            product.setPrice(product.getPrice() * 0.85);
        }
    }
}
