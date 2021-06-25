package com.springframework.sfgdi.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "HelloWorldGreeting";
	}
	
	

}
