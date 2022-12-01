package com.shopmanagementsystem.spring.model.Purchase;

import com.shopmanagementsystem.spring.Entity.Receipt;
import com.shopmanagementsystem.spring.model.Points.AddPoints.AddPoints;

public class PurchasePoints implements IPurchaseObserver{
    AddPoints addPoints;
    public PurchasePoints(IPurchaseSubject ip){
        ip.register(this);
        addPoints = new AddPoints();
    }


    //Receives receipt, converts receipt into a list of products allowing
    //the points to be calculated
    @Override
    public void update(Receipt receipt) {
        addPoints.addPoints(receipt.getProducts());
    }


}
