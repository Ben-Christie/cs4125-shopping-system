package Model.Subscriber.SubscriberFactory;

import Model.Subscriber.ISystemNotify;
import Model.Subscriber.SubscriberTypes.EmailSubscriber;
import Model.Subscriber.SubscriberTypes.ISubscriberObserver;
import Model.Subscriber.SubscriberTypes.TextSubscriber;

public class DigitalSubscriber extends SubscriberFactory{

    @Override
    public ISubscriberObserver subscriberType(String type, ISystemNotify is, String info) {
        if (type.equals("email")){
            return new EmailSubscriber(is,info);
        }else if (type.equals("text")){
            return new TextSubscriber(is,info);
        }else{
            //error !!
            return null;
        }
    }
}
