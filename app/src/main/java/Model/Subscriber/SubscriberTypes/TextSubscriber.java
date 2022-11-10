package Model.Subscriber.SubscriberTypes;

import Model.Subscriber.ISystemNotify;

public class TextSubscriber implements ISubscriberObserver{
    String number;


    public TextSubscriber(ISystemNotify is, String number){
        is.register(this);
        this.number = number;
    }


    @Override
    public void update(String message) {
        System.out.println("Texting " + number + " " + message);
    }
}
