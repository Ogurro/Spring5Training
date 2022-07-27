package com.pw.spring5training.controller.dependencyInjection;

import com.pw.spring5training.services.dependencyInjection.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectedController {

    private final GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
