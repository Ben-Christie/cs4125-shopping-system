package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.Entity.Receipt;

public class KeepPurchase implements IPurchaseObserver {

    public KeepPurchase(IPurchaseSubject ip) {
        ip.register(this);
    }
    @Override
    public void update(Receipt receipt) {
        System.out.println("Storing in the database");
    }
}
