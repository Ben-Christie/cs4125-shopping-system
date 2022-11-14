package com.shopmanagementsystem.spring.model.Subscribe.SubscriberFactory;

import com.shopmanagementsystem.spring.model.Subscribe.ISubscriberObserver;
import com.shopmanagementsystem.spring.model.Subscribe.ISystemNotify;

public abstract class SubscriberFactory {
    abstract ISubscriberObserver subscriberType(String type, ISystemNotify is, String info);
}
