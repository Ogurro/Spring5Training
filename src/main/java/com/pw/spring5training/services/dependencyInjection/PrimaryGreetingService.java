package com.pw.spring5training.services.dependencyInjection;

import com.pw.spring5training.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }

}
