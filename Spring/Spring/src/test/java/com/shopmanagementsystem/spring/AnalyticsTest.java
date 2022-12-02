package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;


class AnalyticsTest {

    @Test
    void allProductsTest() {
        allProducts testingAllProducts = new allProducts();
        assertEquals(allProducts.showInfo());
    }

    @Test
    void fruitsAndVegTest() {
        fruitAndVeg testingFruitsAndVeg = new fruitAndVeg();
        assertEquals(fruitAndVeg.showInfo());
    }

    @Test
    void meatAndFishTest() {
        meatAndFish testingMeatAndFish = new meatAndFish();
        assertEquals(meatAndFish.showInfo());
    }
}
