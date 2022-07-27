package com.pw.spring5training.services.profile;

import com.pw.spring5training.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service("i18nService")
public class I18nDogGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "woof";
    }

}
