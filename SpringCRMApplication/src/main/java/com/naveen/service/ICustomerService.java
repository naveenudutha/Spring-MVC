package com.naveen.service;

import java.util.List;

import com.naveen.model.CustomerInfo;

public interface ICustomerService {

	public List<CustomerInfo> getCustomers();
	
	public void registerCustomer(CustomerInfo customer);
	
	public void deleteCustomer(Integer id);
	
	public CustomerInfo getCx(Integer id);

}