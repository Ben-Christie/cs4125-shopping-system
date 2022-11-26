package com.shopmanagementsystem.spring.model.Analytics;

import com.shopmanagementsystem.spring.model.Checkout.Receipt;
import com.shopmanagementsystem.spring.model.Purchase.IPurchaseObserver;
import com.shopmanagementsystem.spring.model.Purchase.IPurchaseSubject;

public class Analytics implements IPurchaseObserver {

    //Different categories to be analysed
    private Composite meats = new Composite("Meats");
    private Composite fruit = new Composite("Fruits");
    private Composite vegetables = new Composite("Vegetables");
    private Composite fish = new Composite("Fish");
    private Composite other = new Composite("Other");



    public Analytics(IPurchaseSubject ip) {
        ip.register(this);
    }

    @Override
    public void update(Receipt receipt) {
        parseRecipt();
    }

    public String allProducts(){
        Composite allProducts = new Composite("All Products");
        allProducts.addComponent(meats);
        allProducts.addComponent(fruit);
        allProducts.addComponent(vegetables);
        allProducts.addComponent(fish);
        allProducts.addComponent(other);
        return allProducts.showInfo();
    }

    public String fruitAndVeg(){
        Composite fruitAndVeg = new Composite("Fruit and Vegetables");
        fruitAndVeg.addComponent(fruit);
        fruitAndVeg.addComponent(vegetables);
        return fruitAndVeg.showInfo();
    }

    public String meatAndFish(){
        Composite meatAndFish = new Composite("Meat and Fish");
        meatAndFish.addComponent(meats);
        meatAndFish.addComponent(fish);
        return meatAndFish.showInfo();
    }



    private void parseRecipt(){
        //Mimic Logic to convert receipt into relevant LeafProducts and adding to relevant Composite
        //------------------------Example---------------------------------------------
        Component chicken = new ProductLeaf(4.99,2,"Chicken");
        Component cod = new ProductLeaf(3.80,3,"Cod");
        Component burger = new ProductLeaf(5.50,1,"Burger");
        Component apple = new ProductLeaf(2.60,6,"Apple");
        Component orange = new ProductLeaf(1.99,8,"Orange");
        Component onion = new ProductLeaf(2.50,4,"Onion");
        Component crisps = new ProductLeaf(3.70,2,"Crisps");

        meats.addComponent(chicken);
        meats.addComponent(burger);
        fruit.addComponent(apple);
        fruit.addComponent(orange);
        vegetables.addComponent(onion);
        fish.addComponent(cod);
        other.addComponent(crisps);
        //------------------------Example---------------------------------------------

    }
}
