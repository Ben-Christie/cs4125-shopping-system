package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.model.Subscribe.SubscriberService;
import com.shopmanagementsystem.spring.model.Subscribe.SystemNotify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {



    /*
    Notify all subscribers
     */
    @PostMapping("/Subscriber/notifySubscribers")
    public void notifySubscribers(@RequestBody String message){
        SubscriberService s = new SubscriberService();
        s.sendNotification(message);
    }
}
