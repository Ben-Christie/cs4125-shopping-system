package Model.Subscriber;

import java.util.ArrayList;
import java.util.List;

import Model.Subscriber.SubscriberTypes.ISubscriberObserver;

public class SystemNotify implements ISystemNotify{
    List<ISubscriberObserver> subscribers = new ArrayList<>();

    @Override
    public void register(ISubscriberObserver o) {
        subscribers.add(o);
    }

    @Override
    public void unSubscriber(ISubscriberObserver o) {
        for(ISubscriberObserver other : subscribers){
            if (other.equals(o)){
                subscribers.remove(other);
            }
        }
    }

    @Override
    public void notifyObservers() {
        for(ISubscriberObserver subs : subscribers){
            subs.update();
        }
    }
}
