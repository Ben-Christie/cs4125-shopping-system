package com.shopmanagementsystem.spring.model.Points.AddPoints;

import com.shopmanagementsystem.spring.BusinessVariables.BusinessVariables;
import com.shopmanagementsystem.spring.Entity.Product;

import java.util.List;

public class PointCalcSmall extends PointsCalcChain{


    @Override
    public int process(List<Product> products) {
        if(products.size() > BusinessVariables.SMALLPURCHASE){
            return pointsCalcChain.process(products);
        }else{
            //Business logic for small purchase calculating points

            int points = 0;
            for(Product p : products){
                points += (int)p.getPrice() * BusinessVariables.SMALLPURCHASE_MULT;
            }
            return points;
        }

    }




}
