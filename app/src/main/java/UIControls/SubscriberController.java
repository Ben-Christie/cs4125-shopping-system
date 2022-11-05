package UIControls;

import java.util.ArrayList;
import java.util.List;

import Model.Subscriber.SubscriberFactory.DigitalSubscriber;
import Model.Subscriber.SubscriberTypes.ISubscriberObserver;
import Model.Subscriber.SystemNotify;

public class SubscriberController {

    public void notifySubscribers(){
        //Subject - used to notify all subscribers
        SystemNotify is = new SystemNotify();

        //**List of subscribers coming from the db
        List<ISubscriberObserver> subscribers = new ArrayList<>();

        //Factory method to determine which type of subscriber they are
        DigitalSubscriber ds = new DigitalSubscriber();

        subscribers.add(ds.subscriberType("email",is,"aaron@gmail.com"));
        subscribers.add(ds.subscriberType("text",is,"092324242"));
        //**



        //Send notification
        is.notifyObservers();


    }
}
