package com.amazon.sns.controller;

import com.amazon.sns.pojo.SNSSubscriptionRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SNSController {

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(@RequestBody(required = false) SNSSubscriptionRequest snsSubscriptionRequest) {
        System.out.println("SNS Subscription Request  : " + snsSubscriptionRequest);
        return "index";
    }


}
