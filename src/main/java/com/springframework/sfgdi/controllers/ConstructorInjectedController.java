package com.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
	
	

}
