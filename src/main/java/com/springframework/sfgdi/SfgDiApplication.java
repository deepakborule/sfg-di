package com.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframework.sfgdi.controllers.ConstructorInjectedController;
import com.springframework.sfgdi.controllers.I18nController;
import com.springframework.sfgdi.controllers.MyController;
import com.springframework.sfgdi.controllers.PropertyInjectedController;
import com.springframework.sfgdi.controllers.SetterInjectedController;
import com.springframework.sfgdi.examplebeans.AppPropertiesReaderBean;
import com.springframework.sfgdi.examplebeans.FakeDataSource;
import com.springframework.sfgdi.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("------- Profile Controller--------------");
		I18nController i18Controller = (I18nController)context.getBean(I18nController.class);
		System.out.println(i18Controller.sayHello());
		
		MyController ctrl = (MyController)context.getBean("myController");
		System.out.println(ctrl.getGreeting());
		
		System.out.println("------- Property Injected Controller--------------");
		PropertyInjectedController piController = (PropertyInjectedController)context.getBean(PropertyInjectedController.class);
		System.out.println(piController.getGreeting());
		
		System.out.println("------- Setter Injected Controller--------------");
		SetterInjectedController siController = context.getBean(SetterInjectedController.class);
		System.out.println(siController.getGreeting());
		
		System.out.println("------- Constructor Injected Controller--------------");
		ConstructorInjectedController ciController = context.getBean(ConstructorInjectedController.class);
		System.out.println(ciController.getGreeting());
		
		
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
		
		
		System.out.println("Fake JMS Properties..............");
		
		FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());
		
		System.out.println("application Properties..............");
		
		AppPropertiesReaderBean appPropertiesReaderBean = context.getBean(AppPropertiesReaderBean.class);
		System.out.println(appPropertiesReaderBean.getUser());
		System.out.println(appPropertiesReaderBean.getPassword());
		System.out.println(appPropertiesReaderBean.getUrl());
		
	}

}
