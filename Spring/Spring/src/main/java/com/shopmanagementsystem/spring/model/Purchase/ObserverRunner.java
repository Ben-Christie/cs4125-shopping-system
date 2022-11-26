package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Analytics.Analytics;
import com.shopmanagementsystem.spring.model.Checkout.Receipt;

public class ObserverRunner {

    PurchaseSubject purchaseSubject;
    public ObserverRunner(){
        purchaseSubject = new PurchaseSubject();
        PurchasePoints p = new PurchasePoints(purchaseSubject);
        KeepPurchase kp = new KeepPurchase(purchaseSubject);
        Analytics analytics = new Analytics(purchaseSubject);
    }

    public void purchaseUpdate(Receipt receipt){
        purchaseSubject.receivePurchaseInfo(receipt);
    }
}
