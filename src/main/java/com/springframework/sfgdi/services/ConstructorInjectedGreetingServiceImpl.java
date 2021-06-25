package com.springframework.sfgdi.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "HelloWorldGreeting";
	}
	
	

}
