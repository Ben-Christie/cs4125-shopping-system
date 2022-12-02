package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.model.Subscribe.SubscriberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {


    SubscriberService s = new SubscriberService();
    /*
     * Notify all subscribers
     */
    @PostMapping("/Subscriber/notifySubscribers")
    public void notifySubscribers(@RequestBody String message) {
        s.sendNotification(message);
    }

//    @PostMapping("/Subscriber/notifySubscribers")
//    public void addSubscriber(){
//        s.addSubscriber();
//    }
}
