package com.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "Primary--HelloWorldGreeting";
	}
	
	

}
