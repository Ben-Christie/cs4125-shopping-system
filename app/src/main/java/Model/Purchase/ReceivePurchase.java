package Model.Purchase;

import java.util.ArrayList;
import java.util.List;

public class ReceivePurchase implements IPurchaseSubject{
    List<IPurchaseObserver> observers = new ArrayList<>();
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
}
