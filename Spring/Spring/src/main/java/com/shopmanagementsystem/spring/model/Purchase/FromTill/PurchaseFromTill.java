package com.shopmanagementsystem.spring.model.Purchase.FromTill;

import com.shopmanagementsystem.spring.model.Purchase.PurchaseSender;
import com.shopmanagementsystem.spring.model.Purchase.PurchaseSubject;
import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;
import com.shopmanagementsystem.spring.model.Purchase.KeepPurchase;
import com.shopmanagementsystem.spring.model.Purchase.Purchase;

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
