package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;

public class KeepPurchase implements IPurchaseObserver {

    public KeepPurchase(IPurchaseSubject ip) {
        ip.register(this);
    }

    @Override
    public void update(PurchaseInformation purchaseInfo) {
        System.out.println("Storing in the database");
        purchaseInfo.printInformation();
    }
}
