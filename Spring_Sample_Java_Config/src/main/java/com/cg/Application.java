package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.configuration.Appconfig;
import com.cg.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
