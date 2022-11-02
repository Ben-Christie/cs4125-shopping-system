package Model.Purchase;

/*
Class that deals with any business logic involved with a purchase i.e earning points from that purchase
 */
public class Purchase implements IPurchaseObserver{

    public Purchase(IPurchaseSubject ip){
        ip.register(this);
    }

    @Override
    public void update() {

    }


}
