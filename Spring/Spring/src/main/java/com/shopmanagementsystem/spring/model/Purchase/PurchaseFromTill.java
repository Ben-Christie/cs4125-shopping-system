package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;

public class PurchaseFromTill {
    PurchaseSubject purchaseSubject;
    public PurchaseFromTill(){
        purchaseSubject = new PurchaseSubject();
        Purchase p = new Purchase(purchaseSubject);
        KeepPurchase kp = new KeepPurchase(purchaseSubject);
        PurchaseSender ps = new PurchaseSender(purchaseSubject);
    }

    public void receivePurchaseFromTill(PurchaseInformation purchaseInformation){
        purchaseSubject.receivePurchaseInfo(purchaseInformation);
    }
}
