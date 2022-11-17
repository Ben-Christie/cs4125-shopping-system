package com.shopmanagementsystem.spring.model.Subscribe;

import com.shopmanagementsystem.spring.model.Subscribe.SubscriberFactory.DigitalSubscriber;

public class SubscriberService {
    SystemNotify systemNotify;

    public SubscriberService(){
        systemNotify = new SystemNotify();
    }

    public void sendNotification(String message){
        DigitalSubscriber ds = new DigitalSubscriber();


        //Example of reading from db
        ds.subscriberType("email",systemNotify,"aaron@gmail.com");
        ds.subscriberType("text",systemNotify,"023874343");


        systemNotify.sendSubscribers(message);


    }

}
