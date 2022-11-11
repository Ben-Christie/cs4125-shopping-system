package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;

import java.util.ArrayList;
import java.util.List;

public class PurchaseSubject implements IPurchaseSubject{
    private List<IPurchaseObserver> observers = new ArrayList<>();
    private PurchaseInformation purchaseInformation;


    @Override
    public void register(IPurchaseObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(IPurchaseObserver o) {
        for (IPurchaseObserver other : observers){
            if(other.equals(o)){
                observers.remove(o);
            }
        }
    }

    @Override
    public void notifyAllObservers() {
        for (IPurchaseObserver o : observers){
            o.update(purchaseInformation);
        }
    }

    public void receivePurchaseInfo(PurchaseInformation purchaseInfo){
        this.purchaseInformation = purchaseInfo;
        notifyAllObservers();
    }
}
