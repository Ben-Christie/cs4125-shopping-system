package Model.Purchase;

import java.util.ArrayList;
import java.util.List;

import Database.DBEntity.IPurchaseInfoEntity;

public class ReceivePurchase implements IPurchaseSubject{
    private List<IPurchaseObserver> observers = new ArrayList<>();
    private List<IPurchaseInfoEntity> purchaseInfo = new ArrayList<>();


    @Override
    public void register(IPurchaseObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(IPurchaseObserver o) {
        for (IPurchaseObserver other : observers){
            if(other.equals(o)){
                observers.remove(o);
            }
        }
    }

    @Override
    public void notifyAllObservers() {
        for (IPurchaseObserver o : observers){
            o.notify();
        }
    }

    public void receivePurchaseInfo(List<IPurchaseInfoEntity> purchaseInfo){
        this.purchaseInfo = purchaseInfo;
        notifyAllObservers();
    }
}
