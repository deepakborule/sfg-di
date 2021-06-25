package com.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sfgdi.services.PropertyInjectedGreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController piController;
	
	@BeforeEach
	void setup()
	{
		piController = new PropertyInjectedController();
		piController.greetingService = new PropertyInjectedGreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(piController.getGreeting());
	}

}
