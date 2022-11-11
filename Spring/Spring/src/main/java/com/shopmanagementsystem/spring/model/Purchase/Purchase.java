package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;

public class Purchase implements IPurchaseObserver{

    public Purchase(IPurchaseSubject ip){
        ip.register(this);
    }


    //Receives a list with all the purchase detials
    @Override
    public void update(PurchaseInformation purchaseInfo) {
        System.out.println("Purchase class now sees");
        purchaseInfo.printInformation();
    }


}
