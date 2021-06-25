package com.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.sfgdi.services.GreetingService;


@Controller
public class SetterInjectedController {
	
	
	private GreetingService greetingService;

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		System.out.println("setGreetingService Method Called");
		this.greetingService = greetingService;
	}


	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}

}
