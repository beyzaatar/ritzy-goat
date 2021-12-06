package com.rzk.RitzyGoat.business.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rzk.RitzyGoat.core.utilities.results.DataResult;
import com.rzk.RitzyGoat.core.utilities.results.Result;
import com.rzk.RitzyGoat.entities.concretes.Neighborhood;

@RestController
@RequestMapping("/api/neighborhoods")
public class NeighborhoodController {

	private NeighborhoodService neighborhoodService;

	@Autowired
	public NeighborhoodController(NeighborhoodService neighborhoodService) {
		
		this.neighborhoodService = neighborhoodService;
	
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Neighborhood neighborhood) {
		
		return this.neighborhoodService.add(neighborhood);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Neighborhood>> getAll(){
		
		return this.neighborhoodService.getAll();
		
	}
	
	
	
}
