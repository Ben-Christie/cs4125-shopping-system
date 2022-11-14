package com.shopmanagementsystem.spring.model.Subscribe.SubscriberTypes;

import com.shopmanagementsystem.spring.model.Subscribe.ISubscriberObserver;
import com.shopmanagementsystem.spring.model.Subscribe.ISystemNotify;

public class EmailSubscriber implements ISubscriberObserver {
    private String email;

    public EmailSubscriber(ISystemNotify is, String email){
        is.register(this);
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Emailing " + email + " " + message);
    }
}
