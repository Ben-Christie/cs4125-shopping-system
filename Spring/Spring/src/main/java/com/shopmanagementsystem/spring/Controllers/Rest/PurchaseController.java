package com.shopmanagementsystem.spring.Controllers.Rest;


import com.shopmanagementsystem.spring.model.Purchase.PurchaseFromTill;
import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    /*
    System receives purchase information from the till
     */
    @PostMapping("/Purchase/ReceiveFromTill")
    public void receivePurchaseInfoFromTill(@RequestBody PurchaseInformation purchaseInfo){
        PurchaseFromTill pt = new PurchaseFromTill();
        pt.receivePurchaseFromTill(purchaseInfo);
    }


}
