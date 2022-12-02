package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.DTO.ProductDTO;
import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Mappers.ProductMapper;
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

    @Autowired
    private ProductOrder pfo;

    /*
     * Need to wire in our display all products Service object
     */
    @Autowired
    private DisplayProducts dp;

    @Autowired
    private ProductMapper productMapper;


    /*
     * System receives products from UI that the user would like to order -> stores
     * them in the cart until user clicks checkout
     */
    @PostMapping("/OrderPurchase/receiveProductForOrder")
    public void receiveProductForOrder(@RequestBody ProductDTO product) {
        Product productEntity = productMapper.DTOToEntity(product);
        pfo.addToCart(productEntity);
    }

    /*
     * User clicks checkout, all items in their cart are checked out
     */
    @PostMapping("/OrderPurchase/checkOut")
    public String checkOut() {
        String receipt = pfo.checkOut().formatedReceipt();
        //pfo.clearCart();
        return receipt;
    }


    /*
    Display all products in the db, allowing the user to see each and order
    whatever one they want
     */
    @GetMapping("/OrderPurchase/displayAllProducts")
    public List<Product> displayAllProducts() {
        return dp.displayAll();
    }
}
