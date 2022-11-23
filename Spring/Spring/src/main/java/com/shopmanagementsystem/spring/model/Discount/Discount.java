package com.shopmanagementsystem.spring.model.Discount;

import com.shopmanagementsystem.spring.Entity.User;

public class Discount {
  // states
  IDiscountState bronzeDiscount;
  IDiscountState silverDiscount;
  IDiscountState goldDiscount;
  IDiscountState platinumDiscount;

  IDiscountState discountState;

  public Discount(User user) {
    // initialize states
    bronzeDiscount = new BronzeTier(this);
    silverDiscount = new SilverTier(this);
    goldDiscount = new GoldTier(this);
    platinumDiscount = new PlatinumTier(this);

    discountState = bronzeDiscount;

    if (user.getLoyaltyPoints() > 500) {
      setDiscountState(getSilverDiscount());
    } else if (user.getLoyaltyPoints() > 1000) {
      setDiscountState(getGoldDiscount());
    } else if (user.getLoyaltyPoints() > 2000) {
      setDiscountState(getPlatinumDiscount());
    }

  }

  public void setDiscountState(IDiscountState discountState) {
    this.discountState = discountState;
  }

  public IDiscountState getDiscountState() {
    return this.discountState;
  }

  public IDiscountState getBronzeDiscount() {
    return this.bronzeDiscount;
  }

  public IDiscountState getSilverDiscount() {
    return this.silverDiscount;
  }

  public IDiscountState getGoldDiscount() {
    return this.goldDiscount;
  }

  public IDiscountState getPlatinumDiscount() {
    return this.platinumDiscount;
  }
}
