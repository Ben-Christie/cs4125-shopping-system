package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;

public interface IPurchaseObserver {
    void update(PurchaseInformation purchaseInformation);
}
