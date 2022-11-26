package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.model.Checkout.Receipt;
import com.shopmanagementsystem.spring.model.Points.AddPoints.AddPoints;

public class Purchase implements IPurchaseObserver{
    AddPoints addPoints;
    public Purchase(IPurchaseSubject ip){
        ip.register(this);
        addPoints = new AddPoints();
    }


    //Receives a list with all the purchase detials
    @Override
    public void update(Receipt receipt) {
        System.out.println("Purchase class now sees");
        addPoints.addPoints(receipt.getProducts());
    }


}
