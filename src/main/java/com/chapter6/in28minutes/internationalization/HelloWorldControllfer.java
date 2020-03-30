package com.chapter6.in28minutes.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldControllfer {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required = false)Locale locale) {
        return messageSource.getMessage("good.morning.message", null, locale );
    }

    @GetMapping(path = "/language")
    public String HelloWorld(){
        return "Good Morning";
    }
}
