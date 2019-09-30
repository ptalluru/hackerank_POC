package com.cg;

import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).toString());

	}

}
