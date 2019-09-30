package com.example.test;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) throws IOException {
		Method method = new Method();
		Employee employee = new Employee();
		Employeee1 employeee1 = new  Employeee1();
		employee.setCountryCode("abcd");
		//employee.setEntityId("1234");
		employeee1.setCountryCode(employee.getCountryCode());
		//method.test(employeee1);
		ObjectMapper mapper = new ObjectMapper();
		String newemp = mapper.writeValueAsString(employeee1);
		Employeee1 newempobj = mapper.readValue(newemp, Employeee1.class);
		
		System.out.println("Object is " + mapper.writeValueAsString(employeee1));
		
	}
	
	
}
