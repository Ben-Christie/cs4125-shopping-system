package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Checkout.Receipt;

public class KeepPurchase implements IPurchaseObserver {

    public KeepPurchase(IPurchaseSubject ip) {
        ip.register(this);
    }

    @Override
    public void update(Receipt purchaseInfo) {
        System.out.println("Storing in the database");
    }
}
