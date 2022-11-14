package com.shopmanagementsystem.spring.model.Subscribe;

public interface ISystemNotify {
    void register(ISubscriberObserver o);
    void unSubscriber(ISubscriberObserver o);
    void notifyObservers();
}
