package com.pw.spring5training.services.profile;

import com.pw.spring5training.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("i18nService")
public class I18nCatGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "meow";
    }

}
