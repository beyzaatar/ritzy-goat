package com.rzk.RitzyGoat.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rzk.RitzyGoat.core.utilities.results.SuccessResult;
import com.rzk.RitzyGoat.business.abstracts.CustomerService;
import com.rzk.RitzyGoat.core.utilities.results.DataResult;
import com.rzk.RitzyGoat.core.utilities.results.Result;
import com.rzk.RitzyGoat.core.utilities.results.SuccessDataResult;
import com.rzk.RitzyGoat.dataAccess.abstracts.CustomerDao;
import com.rzk.RitzyGoat.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public DataResult<List<Customer>> getAll() {
		return new SuccessDataResult<List<Customer>>(customerDao.findAll(),"customers are listed");
	}

	@Override
	public Result add(Customer customer) {
		customerDao.save(customer);
		return new SuccessResult("registration is successful!");

	}

}
