package com.amazon.sns.controller;

import com.amazon.sns.pojo.SNSSubscriptionRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SNSController {

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST}
            , consumes = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE},
            produces = {"text/plain;charset=UTF-8", MediaType.APPLICATION_JSON_VALUE})
    public String index(@RequestBody(required = false) SNSSubscriptionRequest snsSubscriptionRequest) {
        System.out.println("SNS Subscription Request  : " + snsSubscriptionRequest);
        return "index";
    }


}
