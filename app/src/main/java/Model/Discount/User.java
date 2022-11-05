package Model.Discount;

import java.util.ArrayList;

public class User implements IDiscountState {
    private String name;
    private int loyaltyPoints;
    private ArrayList<Product> cart = new ArrayList<>();

    // states
    IDiscountState platinumDiscount;
    IDiscountState goldDiscount;
    IDiscountState silverDiscount;
    IDiscountState bronzeDiscount;

    IDiscountState discountState;

    public User(String name, int loyaltyPoints) {
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;

        //initialise states
        platinumDiscount = new PlatinumDiscount(this);
        goldDiscount = new GoldDiscount(this);
        silverDiscount = new SilverDiscount(this);
        bronzeDiscount = new BronzeDiscount(this);

        if(this.loyaltyPoints > 500) {
            setDiscountState(bronzeDiscount);
        } else if(this.loyaltyPoints > 1000) {
            setDiscountState(silverDiscount);
        } else if(this.loyaltyPoints > 1500) {
            setDiscountState(goldDiscount);
        } else if(this.loyaltyPoints > 2000) {
            setDiscountState(platinumDiscount);
        }
    }

    public void setDiscountState(IDiscountState newDiscountState) {
        discountState = newDiscountState;
    }

    public IDiscountState getDiscountState() {
        return discountState;
    }


    public IDiscountState getPlatinumDiscount() {
        return platinumDiscount;
    }

    public IDiscountState getGoldDiscount() {
        return goldDiscount;
    }

    public IDiscountState getSilverDiscount() {
        return silverDiscount;
    }

    public IDiscountState getBronzeDiscount() {
        return bronzeDiscount;
    }

    @Override
    public void applyDiscount(ArrayList<Product> cart) {
        discountState.applyDiscount(cart);
    }
}
