package com.shopmanagementsystem.spring;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;


class AnalyticsTest {

    @Test
    void allProductsTest() {
        var testingAllProducts = new allProducts();
        assertEquals(allProducts.showInfo());
    }

    @Test
    void fruitsAndVegTest() {
        var testingFruitsAndVeg = new fruitAndVeg();
        assertEquals(fruitAndVeg.showInfo());
    }

    @Test
    void meatAndFishTest() {
        var testingMeatAndFish = new meatAndFish();
        assertEquals(meatAndFish.showInfo());
    }
}
