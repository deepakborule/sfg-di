package com.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
		
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
