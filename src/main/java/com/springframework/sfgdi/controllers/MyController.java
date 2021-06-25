package com.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String myHello()
	{
		System.out.println("Hello World");
		return "Hello Duniya";
	}

}
