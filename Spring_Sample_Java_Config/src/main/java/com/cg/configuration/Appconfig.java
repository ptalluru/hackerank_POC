package com.cg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.cg.repository.CustomerRepository;
import com.cg.repository.CustomerRepositoryImpl;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.cg"})
@PropertySource("app.properties")
public class Appconfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		//CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		//customerService.setCustomerRepository(getCustomerRepository());
//		return customerService;
//	}
//
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new CustomerRepositoryImpl();
//	}

}
