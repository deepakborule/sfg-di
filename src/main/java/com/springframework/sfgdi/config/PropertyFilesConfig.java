package com.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

import com.springframework.sfgdi.examplebeans.FakeDataSource;
import com.springframework.sfgdi.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:fakedatasource.properties","classpath:fakejms.properties"})

//Second Way to read multiple properties files

@PropertySources({
	@PropertySource("classpath:fakedatasource.properties"),
	@PropertySource("classpath:fakejms.properties")
})
public class PropertyFilesConfig {
	
	@Value("${com.username}")
	String user;
	@Value("${com.password}")
	String password;
	
	@Value("${com.url}")
	String url;
	
	
	@Value("${com.jms.username}")
	String jmsUser;
	@Value("${com.jms.password}")
	String jmsPassword;
	
	@Value("${com.jms.url}")
	String jmsUrl;
	
	
	@Bean
	public FakeDataSource fakeDataSource()
	{
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	
	@Bean
	public FakeJmsBroker fakeJmsBroker()
	{
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUser(jmsUser);
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsUrl);
		return fakeJmsBroker;
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
