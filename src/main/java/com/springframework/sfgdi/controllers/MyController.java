package com.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	/*public String myHello()
	{
		System.out.println("Hello World");
		return "Hello Duniya";
	}*/
	
	@Autowired
	public GreetingService greetingService;

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}

}
