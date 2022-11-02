package Model.Purchase;

public interface IPurchaseSubject {
    void register(IPurchaseObserver o);
    void remove(IPurchaseObserver o);
    void notifyAllObservers();
}
