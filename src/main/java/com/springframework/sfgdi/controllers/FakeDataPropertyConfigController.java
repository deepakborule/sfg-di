package com.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

import com.springframework.sfgdi.examplebeans.FakeDataSource;

@Controller
@PropertySource("classpath:fakedatasource.properties")
public class FakeDataPropertyConfigController {
	
	@Value("${com.username}")
	String user;
	@Value("${com.password}")
	String password;
	
	@Value("${com.url}")
	String url;
	
	@Bean
	public FakeDataSource fakeDataSource()
	{
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	/*
	 *  Even without this code we can read properties from property file
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties()
	{
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
		
	}*/
	

}
