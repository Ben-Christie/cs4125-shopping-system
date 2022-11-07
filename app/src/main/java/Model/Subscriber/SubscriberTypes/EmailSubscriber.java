package Model.Subscriber.SubscriberTypes;

import Model.Subscriber.ISystemNotify;

public class EmailSubscriber implements ISubscriberObserver {
    private String email;

    public EmailSubscriber(ISystemNotify is, String email){
        is.register(this);
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Emailing " + email);
    }
}
