package com.amazon.sns.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SNSController {

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(@RequestBody(required = false) String snsSubscriptionRequest, Model model) {
        System.out.println("SNS Subscription Request  : " + snsSubscriptionRequest);
        if (snsSubscriptionRequest != null) {
            JSONObject jsonObject = new JSONObject(snsSubscriptionRequest);
            String subscriptionURL = jsonObject.getString("SubscribeURL");
            model.addAttribute("subscriptionURL", subscriptionURL);
        }
        return "index";
    }


}
