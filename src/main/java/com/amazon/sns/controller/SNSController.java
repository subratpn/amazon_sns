package com.amazon.sns.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SNSController {

    static ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index(@RequestBody(required = false) String snsSubscriptionRequestString, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println("SNS Subscription Request String : " + snsSubscriptionRequestString);
        ModelAndView modelAndView = new ModelAndView("index");
        if (snsSubscriptionRequestString != null) {
            snsSubscriptionRequestString = snsSubscriptionRequestString.replace("\n", "");
            JSONObject jsonObject = new JSONObject(snsSubscriptionRequestString);
            final String subscribeURL = jsonObject.optString("SubscribeURL");
            httpServletResponse.sendRedirect(subscribeURL);
            modelAndView.addObject("subscribeURL", subscribeURL);
        }
        return modelAndView;
    }


}
