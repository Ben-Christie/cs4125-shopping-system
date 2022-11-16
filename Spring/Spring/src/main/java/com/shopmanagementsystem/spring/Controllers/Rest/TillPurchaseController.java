package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.model.Purchase.PurchaseFromTill;
import com.shopmanagementsystem.spring.model.Purchase.Wrapper.PurchaseInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TillPurchaseController {



    /*
    User scans there phone, userid is sent to the Till via NFC
     */
    @GetMapping("/TillPurchase/scan")
    public int scan(){
        //Mimic the user id being sent to till
        return 1;
    }


    /*
     * System receives purchase information from the till
     */
    @PostMapping("/TillPurchase/receivePurchaseInfoFromTill")
    public void receivePurchaseInfoFromTill(@RequestBody PurchaseInformation purchaseInfo) {
        PurchaseFromTill pt = new PurchaseFromTill();
        pt.receivePurchaseFromTill(purchaseInfo);
    }

}
