package com.amazon.sns.controller;

import com.amazon.sns.pojo.SNSSubscriptionRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SNSController {

    static ObjectMapper objectMapper = new ObjectMapper();
    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(@RequestBody(required = false) String snsSubscriptionRequestString, Model model) throws JsonProcessingException {
        System.out.println("SNS Subscription Request String : " + snsSubscriptionRequestString);
        if (snsSubscriptionRequestString != null) {
            SNSSubscriptionRequest snsSubscriptionRequest =  objectMapper.readValue(snsSubscriptionRequestString, SNSSubscriptionRequest.class);
            model.addAttribute("snsSubscriptionRequest", snsSubscriptionRequest);
        }
        return "index";
    }


}
