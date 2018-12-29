package com.spring.boot.web.mvc.service;

import java.util.List;

import com.spring.boot.rest.Customer;
import com.spring.boot.web.mvc.controller.model.Login;

public interface ICustomerService {

	List<Customer> getCustomers();

	Customer findCustomerByEmail(String email);

	String deleteCustomerByEmail(String email);

	void save(Customer customer);

	String updateCustomer(Customer customer);

	String validateUser(Login login);

	String deleteCustomerByCid(int cid);

}
