package Model.Purchase;

import java.util.List;

import Database.DBEntity.IPurchaseInfoEntity;

/*
Class that deals with any business logic involved with a purchase i.e earning points from that purchase
 */
public class Purchase implements IPurchaseObserver{

    public Purchase(IPurchaseSubject ip){
        ip.register(this);
    }


    //Receives a list with all the purchase detials
    @Override
    public void update(List<IPurchaseInfoEntity> purchaseInfo) {
        //Now we can use the purchase info the calculate the amount of points have been earned
    }


}
