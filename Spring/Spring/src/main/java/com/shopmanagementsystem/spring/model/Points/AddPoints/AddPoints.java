package com.shopmanagementsystem.spring.model.Points.AddPoints;

import com.shopmanagementsystem.spring.Entity.Product;

import java.util.List;

public class AddPoints {


    public void addPoints(List<Product> products){

        //Set up chain
        PointCalcSmall pointCalcSmall = new PointCalcSmall();
        PointCalcMedium pointCalcMedium = new PointCalcMedium();
        PointCalcLarge pointCalcLarge = new PointCalcLarge();

        pointCalcSmall.setNextChain(pointCalcMedium);
        pointCalcMedium.setNextChain(pointCalcLarge);



        //Start chain
        pointCalcSmall.process(products);
    }
}
