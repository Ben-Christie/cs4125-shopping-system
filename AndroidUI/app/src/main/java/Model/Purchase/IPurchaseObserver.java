package Model.Purchase;

import java.util.List;

import Database.DBEntity.IPurchaseInfoEntity;

public interface IPurchaseObserver {
    void update(List<IPurchaseInfoEntity> purchaseInfo);
}
