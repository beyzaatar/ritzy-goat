package com.rzk.RitzyGoat.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rzk.RitzyGoat.business.abstracts.AddressService;
import com.rzk.RitzyGoat.core.utilities.results.DataResult;
import com.rzk.RitzyGoat.core.utilities.results.Result;
import com.rzk.RitzyGoat.entities.concretes.Address;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

	private AddressService addressService;

	@Autowired
	public AddressController(AddressService addressService) {
		
		this.addressService = addressService;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Address address) {
		
		return this.addressService.add(address);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Address>> getAll(){
		
		return this.addressService.getAll();
		
	}
	
	
	
}
