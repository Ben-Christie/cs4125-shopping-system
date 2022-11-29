package com.shopmanagementsystem.spring.model.Purchase.Till;

import com.shopmanagementsystem.spring.model.Checkout.Receipt;
import com.shopmanagementsystem.spring.model.Purchase.ObserverRunner;

public class PurchaseFromTill {
    ObserverRunner observerRunner;
    public PurchaseFromTill(){
        observerRunner = new ObserverRunner();
    }
    public void receivePurchaseFromTill(Receipt receipt){
        observerRunner.purchaseUpdate(receipt);
    }
}
