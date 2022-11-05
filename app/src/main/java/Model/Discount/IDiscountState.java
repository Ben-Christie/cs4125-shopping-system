package Model.Discount;

import java.util.ArrayList;

public interface IDiscountState {
    void applyDiscount(ArrayList<Product> cart);
}
