package com.shopmanagementsystem.spring.model.Discount;

import com.shopmanagementsystem.spring.Entity.User;

public class Discount {
  // states
  ITierState bronzeTier;
  ITierState silverTier;
  ITierState goldTier;
  ITierState platinumTier;

  ITierState tierState;

  public Discount(User user) {
    // initialize states
    bronzeTier = new BronzeTier(this);
    silverTier = new SilverTier(this);
    goldTier = new GoldTier(this);
    platinumTier = new PlatinumTier(this);

    tierState = bronzeTier;

    if (user.getLoyaltyPoints() > 500) {
      setTierState(getSilverTier());
    } else if (user.getLoyaltyPoints() > 1000) {
      setTierState(getGoldTier());
    } else if (user.getLoyaltyPoints() > 2000) {
      setTierState(getPlatinumTier());
    }

  }

  public void setTierState(ITierState tierState) {
    this.tierState = tierState;
  }

  public ITierState getTierState() {
    return this.tierState;
  }

  public ITierState getBronzeTier() {
    return this.bronzeTier;
  }

  public ITierState getSilverTier() {
    return this.silverTier;
  }

  public ITierState getGoldTier() {
    return this.goldTier;
  }

  public ITierState getPlatinumTier() {
    return this.platinumTier;
  }
}
