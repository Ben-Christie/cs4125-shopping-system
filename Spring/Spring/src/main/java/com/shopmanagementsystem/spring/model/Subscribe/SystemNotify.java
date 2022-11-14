package com.shopmanagementsystem.spring.model.Subscribe;

import java.util.ArrayList;
import java.util.List;

public class SystemNotify implements ISystemNotify{
    List<ISubscriberObserver> subscribers = new ArrayList<>();
    String message;
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
            subs.update(message);
        }
    }


    public void sendSubscribers(String message){
        this.message = message;
        notifyObservers();
    }
}
