package com.spring.boot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/customer")
	public Customer findCustomer(){
		Customer customer=new  Customer();
		customer.setEmail("nagen@synergisticit.com");
		customer.setName("Nagendra");
		return customer;
	}

}
