package com.amazon.sns.controller;

import com.amazon.sns.pojo.SNSSubscriptionRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SNSController {

    static ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index(@RequestBody(required = false) String snsSubscriptionRequestString) throws JsonProcessingException {
        System.out.println("SNS Subscription Request String : " + snsSubscriptionRequestString);
        ModelAndView modelAndView = new ModelAndView("index");
        if (snsSubscriptionRequestString != null) {
            SNSSubscriptionRequest snsSubscriptionRequest = objectMapper.readValue(snsSubscriptionRequestString, SNSSubscriptionRequest.class);
            modelAndView.addObject("snsSubscriptionRequest", snsSubscriptionRequest);
        }
        return modelAndView;
    }


}
