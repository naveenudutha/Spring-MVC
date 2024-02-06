package com.naveen.dao;

import org.springframework.data.repository.CrudRepository;

import com.naveen.model.CustomerInfo;

public interface ICustomerDao extends CrudRepository<CustomerInfo, Integer> {

	
}
