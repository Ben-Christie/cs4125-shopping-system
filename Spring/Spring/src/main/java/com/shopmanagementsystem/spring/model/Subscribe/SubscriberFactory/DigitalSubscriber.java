package com.shopmanagementsystem.spring.model.Subscribe.SubscriberFactory;

import com.shopmanagementsystem.spring.model.Subscribe.ISubscriberObserver;
import com.shopmanagementsystem.spring.model.Subscribe.ISystemNotify;
import com.shopmanagementsystem.spring.model.Subscribe.SubscriberTypes.EmailSubscriber;
import com.shopmanagementsystem.spring.model.Subscribe.SubscriberTypes.TextSubscriber;

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
