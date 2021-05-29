package com.amazon.sns.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SNSController {

    static ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index(@RequestBody(required = false) String snsSubscriptionRequestString) {
        System.out.println("SNS Subscription Request String : " + snsSubscriptionRequestString);
        ModelAndView modelAndView = new ModelAndView("index");
        if (snsSubscriptionRequestString != null) {
            snsSubscriptionRequestString = snsSubscriptionRequestString.replace("\n", "");
            JSONObject jsonObject = new JSONObject(snsSubscriptionRequestString);
            final String subscribeURL = jsonObject.optString("SubscribeURL");
            System.out.println(subscribeURL);
            modelAndView = new ModelAndView("redirect:/subscribe");
            modelAndView.addObject("subscribeURL", subscribeURL);
        }
        return modelAndView;
    }

    @RequestMapping(path = "/subscribe", method = RequestMethod.GET)
    public String subscription(@RequestParam String subscribeURL) {
        System.out.println("Inside Subscribe  :" + subscribeURL);
        return "subscription";
    }

}
