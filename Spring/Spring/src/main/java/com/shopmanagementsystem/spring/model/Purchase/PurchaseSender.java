package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;

public class PurchaseSender implements IPurchaseObserver {
    public PurchaseSender(IPurchaseSubject ip) {
        ip.register(this);
    }

    @Override
    public void update(PurchaseInformation purchaseInfo) {
        // Send the purchase info to a data analytics company
        System.out.println("Sending pruchase info to data analytics");
        purchaseInfo.printInformation();
    }
}
