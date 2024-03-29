package com.naveen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.dao.ICustomerDao;
import com.naveen.model.CustomerInfo;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private ICustomerDao repo;
	
	@Override
	public List<CustomerInfo> getCustomers() {
		
		return (List<CustomerInfo>) repo.findAll();
	}

	@Override
	public void registerCustomer(CustomerInfo customer) {
		repo.save(customer);
		
	}

	@Override
	public void deleteCustomer(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public CustomerInfo getCx(Integer id) {
		Optional<CustomerInfo> optional=repo.findById(id);
		return optional.get();
	}

}
