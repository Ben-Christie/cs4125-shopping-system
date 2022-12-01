package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.Entity.Receipt;

public interface IPurchaseObserver {
    void update(Receipt receipt);
}
