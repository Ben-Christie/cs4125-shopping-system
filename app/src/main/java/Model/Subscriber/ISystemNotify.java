package Model.Subscriber;

import Model.Subscriber.SubscriberTypes.ISubscriberObserver;

public interface ISystemNotify {
    void register(ISubscriberObserver o);
    void unSubscriber(ISubscriberObserver o);
    void notifyObservers();
}
