package Model.Purchase;

import java.util.List;

import Database.DBEntity.IPurchaseInfoEntity;

/*
Sends purchase info to data analytics
 */
public class PurchaseSender implements IPurchaseObserver{

    public PurchaseSender(IPurchaseSubject ip) {
        ip.register(this);
    }

    @Override
    public void update(List<IPurchaseInfoEntity> purchaseInfo) {
        //Send the purchase info to a data analytics company
        System.out.println("Sending pruchase info to data analytics");
    }
}
