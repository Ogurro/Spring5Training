package com.pw.spring5training.services.dependencyInjection;

import com.pw.spring5training.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }

}
