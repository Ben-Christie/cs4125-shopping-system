package Model.Discount;

import java.util.ArrayList;

public class BronzeDiscount implements IDiscountState {
    User user;

    public BronzeDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public void applyDiscount(ArrayList<Product> cart) {
        // 5% discount
        for(Product product : cart) {
            product.setPrice(product.getPrice() * 0.95);
        }
    }
}
