package Model.Purchase;

import java.util.List;

/*
Sends purchase info to data analytics
 */
public class PurchaseSender implements IPurchaseObserver{

    public PurchaseSender(IPurchaseSubject ip) {
        ip.register(this);
    }

    @Override
    public void update(List<IPurchaseInfoEntity> purchaseInfo) {
        System.out.println("Sending pruchase info to data analytics");
    }
}
