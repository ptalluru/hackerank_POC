package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.repository.CustomerRepository;
import com.cg.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new CustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.cg.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
