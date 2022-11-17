package com.shopmanagementsystem.spring.model.Points.AddPoints;

import com.shopmanagementsystem.spring.Entity.Product;

import java.util.List;

public abstract class PointsCalcChain {
    public PointsCalcChain pointsCalcChain;
    void setNextChain(PointsCalcChain nextChain){
        this.pointsCalcChain = nextChain;
    }
    abstract int process(List<Product> products);
}
