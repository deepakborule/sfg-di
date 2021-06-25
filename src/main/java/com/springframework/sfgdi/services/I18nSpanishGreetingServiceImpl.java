package com.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "Hey There-EN";
	}

}
