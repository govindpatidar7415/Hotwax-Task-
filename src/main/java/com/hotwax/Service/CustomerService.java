package com.hotwax.Service;

import java.util.List;

import com.hotwax.Entities.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerById(Long id);

	void deleteCustomer(Long id);

	Customer updateCustomer(Long id, Customer customer);
}
