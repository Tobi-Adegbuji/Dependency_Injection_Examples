package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
//I18N just means internationalization
public class I18nController {

    private GreetingService greetingService;

    //no autowire needed for constructors
    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
