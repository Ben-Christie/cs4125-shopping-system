package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.Product;
import com.shopmanagementsystem.spring.model.Purchase.Order.DisplayProducts;
import com.shopmanagementsystem.spring.model.Purchase.Order.ProductOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrderPurchaseController {


    ProductOrder pfo;

    /*
    Need to wire in our display all products Service object
     */
    @Autowired
    DisplayProducts dp = new DisplayProducts();

    @Autowired
    public OrderPurchaseController(){
        pfo = new ProductOrder();
    }

        /*
    System receives products from UI that the user would like to order -> stores them in the cart until user clicks checkout
     */
    @PostMapping("/OrderPurchase/receiveProductForOrder")
    public void receiveProductForOrder(@RequestBody Product product){
        pfo.addToCart(product);
    }

    /*
    User clicks checkout, all items in their cart are checked out
     */
    @PostMapping("/OrderPurchase/checkOut")
    public void checkOut(){
        pfo.checkOut();
    }



    @GetMapping("/OrderPurchase/displayAllProducts")
    public List<Product> displayAllProducts(){
        return dp.displayAll();
    }
}
