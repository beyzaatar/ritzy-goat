package com.rzk.RitzyGoat.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rzk.RitzyGoat.entities.concretes.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {

	
	
}
