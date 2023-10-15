package com.ranjs.spring.batch.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjs.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
