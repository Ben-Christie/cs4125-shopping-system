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
        //List<ISubscriberObserver> subscribers = new ArrayList<>();

        //Factory method to determine which type of subscriber they are
        DigitalSubscriber ds = new DigitalSubscriber();


        //For loop through list of subscribers from db -> use subscriberType to create the
        //correct type of subscriber i.e email or text
        ds.subscriberType("email",is,"aaron@gmail.com");
        ds.subscriberType("text",is,"092324242");




        //Send notification
        is.sendSubscribers("This message will be sent to all subscribers");


    }
}
