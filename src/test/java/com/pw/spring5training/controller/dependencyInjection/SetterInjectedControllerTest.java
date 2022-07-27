package com.pw.spring5training.controller.dependencyInjection;

import com.pw.spring5training.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World - Setter", controller.getGreeting());
    }

}
