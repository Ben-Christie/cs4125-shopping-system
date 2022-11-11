package UIControls;

import java.util.ArrayList;
import java.util.List;

import Model.Purchase.KeepPurchase;
import Database.DBEntity.IPurchaseInfoEntity;
import Model.Purchase.Purchase;
import Database.DBEntity.PurchaseInfoEntity;
import Model.Purchase.PurchaseSender;
import Model.Purchase.ReceivePurchase;

public class PurchaseController {

    public void scan(){
        //Retrieve userId from db and send it through nfc on phone to till
    }



    /*
    Receive purchase info from the till and notify all observers
     */
    public void receivePurchaseFromTill(){

        //The subject
        ReceivePurchase receivePurchase = new ReceivePurchase();

        //Three observers, waiting for receive purchase to receive the purchase info
        Purchase p = new Purchase(receivePurchase);
        KeepPurchase kp = new KeepPurchase(receivePurchase);
        PurchaseSender ps = new PurchaseSender(receivePurchase);



        //***Example of purchase coming from the till ***//
        List<IPurchaseInfoEntity> purchaseInfo = new ArrayList<>();
        purchaseInfo.add(new PurchaseInfoEntity("Banana",1.50));
        purchaseInfo.add(new PurchaseInfoEntity("Burger",3.99));
        purchaseInfo.add(new PurchaseInfoEntity("Chicken",4.50));
        //***Example of purchase coming from the till ***//

        //receive purchase has got the info from the till, now we notify all observers
        receivePurchase.receivePurchaseInfo(purchaseInfo);


    }
}
