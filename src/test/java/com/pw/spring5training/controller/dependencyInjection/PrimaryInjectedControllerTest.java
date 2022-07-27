package com.pw.spring5training.controller.dependencyInjection;

import com.pw.spring5training.services.dependencyInjection.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryInjectedControllerTest {

    PrimaryInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PrimaryInjectedController(new PrimaryGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World - Primary", controller.getGreeting());
    }
}
