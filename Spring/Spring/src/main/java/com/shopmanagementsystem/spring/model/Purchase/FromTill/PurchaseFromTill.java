package com.shopmanagementsystem.spring.model.Purchase.FromTill;

import com.shopmanagementsystem.spring.model.Analytics.Analytics;
import com.shopmanagementsystem.spring.model.Checkout.Receipt;
import com.shopmanagementsystem.spring.model.Purchase.ObserverRunner;
import com.shopmanagementsystem.spring.model.Purchase.PurchaseSubject;
import com.shopmanagementsystem.spring.model.Purchase.KeepPurchase;
import com.shopmanagementsystem.spring.model.Purchase.Purchase;

public class PurchaseFromTill {
    ObserverRunner observerRunner;
    public PurchaseFromTill(){
        observerRunner = new ObserverRunner();
    }
    public void receivePurchaseFromTill(Receipt receipt){
        observerRunner.purchaseUpdate(receipt);
    }
}
