package UIControls;

import java.util.ArrayList;
import java.util.List;

import Database.KeepPurchase;
import Model.Purchase.IPurchaseInfoEntity;
import Model.Purchase.Purchase;
import Model.Purchase.PurchaseInfoEntity;
import Model.Purchase.ReceivePurchase;
import system.ui.Adapters.CartRecyclerAdapter;

public class PurchaseController {

    public void scan(){
        //Retrieve userId from db and send it through nfc on phone to till
    }

    /*
    Imitate receiving bulk purchase info from the till after customer has paid
     */
    public void receivePurchase(){
        List<IPurchaseInfoEntity> purchaseInfo = new ArrayList<>();


        ReceivePurchase receivePurchase = new ReceivePurchase();
        Purchase p = new Purchase(receivePurchase);
        KeepPurchase kp = new KeepPurchase(receivePurchase);
        CartRecyclerAdapter cartRecyclerAdapter = new CartRecyclerAdapter();


        //***Example of purchase coming from the till ***//
        purchaseInfo.add(new PurchaseInfoEntity("Banana",1.50));
        purchaseInfo.add(new PurchaseInfoEntity("Burger",3.99));
        purchaseInfo.add(new PurchaseInfoEntity("Chicken",4.50));
        //***Example of purchase coming from the till ***//

        receivePurchase.receivePurchaseInfo(purchaseInfo);


    }
}
