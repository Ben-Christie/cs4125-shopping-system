package com.shopmanagementsystem.spring.model.Points.AddPoints;

import com.shopmanagementsystem.spring.BusinessVariables.BusinessVariables;
import com.shopmanagementsystem.spring.Entity.Product;

import java.util.List;

public class PointCalcMedium extends PointsCalcChain{

    @Override
    public int process(List<Product> products) {
        if(products.size() > BusinessVariables.MEDIUMPURCHASE){
            return pointsCalcChain.process(products);
        }else{
            //Business logic for medium purchase


            int points = 0;

            for(Product p : products){
                points += p.getPrice() / BusinessVariables.MEDIUMPURCHASE_MULT;
            }
            return points;
        }
    }
}
