package Model.Purchase;

import java.util.List;

public interface IPurchaseObserver {
    void update(List<IPurchaseInfoEntity> purchaseInfo);
}
