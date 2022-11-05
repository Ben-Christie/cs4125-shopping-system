package Model.Purchase;

import java.util.List;

import Database.DBEntity.IPurchaseInfoEntity;
import Model.Purchase.IPurchaseObserver;
import Model.Purchase.IPurchaseSubject;

public class KeepPurchase implements IPurchaseObserver {

    public KeepPurchase(IPurchaseSubject ip) {
        ip.register(this);
    }


    @Override
    public void update(List<IPurchaseInfoEntity> purchaseInfo) {
        //Connects to the db and stores the purchase there
    }
}
