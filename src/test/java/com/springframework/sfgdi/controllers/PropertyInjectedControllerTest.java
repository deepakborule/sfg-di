package com.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController piController;
	
	@BeforeEach
	void setup()
	{
		piController = new PropertyInjectedController();
		piController.greetingService = new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(piController.getGreeting());
	}

}
