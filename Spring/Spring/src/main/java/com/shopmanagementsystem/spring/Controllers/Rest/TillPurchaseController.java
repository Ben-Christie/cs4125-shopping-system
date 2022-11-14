package com.shopmanagementsystem.spring.Controllers.Rest;


import com.shopmanagementsystem.spring.Database.DBEntity.Product;
import com.shopmanagementsystem.spring.model.Purchase.Order.ProductOrder;
import com.shopmanagementsystem.spring.model.Purchase.PurchaseFromTill;
import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TillPurchaseController {

    /*
    System receives purchase information from the till
     */
    @PostMapping("/TillPurchase/receivePurchaseInfoFromTill")
    public void receivePurchaseInfoFromTill(@RequestBody PurchaseInformation purchaseInfo){
        PurchaseFromTill pt = new PurchaseFromTill();
        pt.receivePurchaseFromTill(purchaseInfo);
    }


}
