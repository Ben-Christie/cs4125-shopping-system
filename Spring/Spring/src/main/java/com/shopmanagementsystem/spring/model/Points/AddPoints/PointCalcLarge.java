package com.shopmanagementsystem.spring.model.Points.AddPoints;

import com.shopmanagementsystem.spring.BusinessVariables.BusinessVariables;
import com.shopmanagementsystem.spring.Entity.Product;

import java.util.List;

public class PointCalcLarge extends PointsCalcChain{


    @Override
    public int process(List<Product> products) {
        if(products.size() > BusinessVariables.LARGEPURCHASE){
            return -1;
        }else{

            //Business logic for large purchase calculating points

            int points = 0;
            for(Product p : products){
                points += p.getPrice() / BusinessVariables.LARGEPURCHASE_MULT;
            }

            return points;
        }
    }
}
