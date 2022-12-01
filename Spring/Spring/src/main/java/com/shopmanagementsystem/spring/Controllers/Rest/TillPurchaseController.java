package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.DTO.ReceiptDTO;
import com.shopmanagementsystem.spring.Mappers.ReceiptMapper;
import com.shopmanagementsystem.spring.Entity.Receipt;
import com.shopmanagementsystem.spring.model.Purchase.Till.PurchaseFromTill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TillPurchaseController {


    PurchaseFromTill purchaseFromTill = new PurchaseFromTill();
    ReceiptMapper receiptMapper = new ReceiptMapper();
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
    public void receivePurchaseInfoFromTill(@RequestBody ReceiptDTO receiptDTO) {
        Receipt receipt = receiptMapper.DTOToEntity(receiptDTO);
        purchaseFromTill.receivePurchaseFromTill(receipt);
    }

}
