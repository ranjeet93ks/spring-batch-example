package com.ranjs.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.ranjs.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		//return customer; -- it will insert all records
		//if we want to filter out only US citizen ppl--> below
		if (customer.getCountry().equals("United States")) {
			return customer;
		} else {
			return null;
		}
	}
}
