package Model.Subscriber.SubscriberFactory;

import Model.Subscriber.ISystemNotify;
import Model.Subscriber.SubscriberTypes.ISubscriberObserver;

public abstract class SubscriberFactory {
    abstract ISubscriberObserver subscriberType(String type, ISystemNotify is, String info);
}
