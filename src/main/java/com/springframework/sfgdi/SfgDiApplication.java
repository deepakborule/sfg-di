package com.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframework.sfgdi.controllers.ConstructorInjectedController;
import com.springframework.sfgdi.controllers.MyController;
import com.springframework.sfgdi.controllers.PropertyInjectedController;
import com.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController ctrl = (MyController)context.getBean("myController");
		String str =ctrl.myHello();
		System.out.println(str);
		
		System.out.println("------- Property Injected Controller--------------");
		PropertyInjectedController piController = (PropertyInjectedController)context.getBean(PropertyInjectedController.class);
		System.out.println(piController.getGreeting());
		
		System.out.println("------- Setter Injected Controller--------------");
		SetterInjectedController siController = context.getBean(SetterInjectedController.class);
		System.out.println(siController.getGreeting());
		
		System.out.println("------- Constructor Injected Controller--------------");
		ConstructorInjectedController ciController = context.getBean(ConstructorInjectedController.class);
		System.out.println(ciController.getGreeting());
	}

}
