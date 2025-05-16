package com.hotwax.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotwax.Entities.Customer;
import com.hotwax.Repository.CustomerRepository;
import com.hotwax.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
	@Override
	public Customer updateCustomer(Long id, Customer customer) {
		Customer existingCustomer = customerRepository.findById(id).orElse(null);
		if (existingCustomer != null) {
			existingCustomer.setFirstName(customer.getFirstName());
			existingCustomer.setLastName(customer.getLastName());
			existingCustomer.setContactMechs(customer.getContactMechs());
			existingCustomer.setOrderHeaders(customer.getOrderHeaders());
			return customerRepository.save(existingCustomer);
		}
		return null;
	}

}
