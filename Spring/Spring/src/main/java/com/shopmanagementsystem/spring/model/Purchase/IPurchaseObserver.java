package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Checkout.Receipt;

public interface IPurchaseObserver {
    void update(Receipt receipt);
}
