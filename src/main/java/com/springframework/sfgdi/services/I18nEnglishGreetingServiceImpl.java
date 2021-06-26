package com.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


// If we set default then if no profile is found this will act as default profile
@Profile({"ES","default"})
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "Hola Mundo-ES";
	}

}
