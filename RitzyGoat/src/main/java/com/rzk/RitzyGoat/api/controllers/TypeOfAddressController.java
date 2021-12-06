package com.rzk.RitzyGoat.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rzk.RitzyGoat.business.abstracts.TypeOfAddressService;
import com.rzk.RitzyGoat.core.utilities.results.DataResult;
import com.rzk.RitzyGoat.core.utilities.results.Result;
import com.rzk.RitzyGoat.entities.concretes.TypeOfAddress;

@RestController
@RequestMapping("/api/addressTypes")
public class TypeOfAddressController {

	private TypeOfAddressService addressService;

	@Autowired
	public TypeOfAddressController(TypeOfAddressService addService) {

		this.addressService = addService;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody TypeOfAddress typeOfAddress) {
		
		return this.addressService.add(typeOfAddress);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<TypeOfAddress>> getAll(){
		
		return this.addressService.getAll();
		
	}
	
	
	
	
}
