package Database;

import java.util.List;

import Model.Purchase.IPurchaseInfoEntity;
import Model.Purchase.IPurchaseObserver;
import Model.Purchase.IPurchaseSubject;

public class KeepPurchase implements IPurchaseObserver {

    public KeepPurchase(IPurchaseSubject ip) {
        ip.register(this);
    }
    @Override
    public void update(List<IPurchaseInfoEntity> purchaseInfo) {

    }
}
