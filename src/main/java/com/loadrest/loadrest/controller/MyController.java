package com.loadrest.loadrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loadrest.loadrest.entities.Load;
import com.loadrest.loadrest.services.LoadService;

@RestController 
public class MyController {
	
	@Autowired
	private LoadService loadSerivice;

	
	
	// Adding New load 1- Post"/load"
	
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load)
	{
		return this.loadSerivice.addLoad(load);
	}
	
	
	
	//Get all Load 2- Get"/load"
	
	@GetMapping("/load")
	public List<Load>getloads()
	{
		return this.loadSerivice.getloads();
	} 
	
	
	
	//Query Param -(shipperId)
	
	@GetMapping("/loads")
	public List<Load> getLoadByShipperIDUsingJPQL(@RequestParam(name = "shipperId") long shipperId)
	{
			return this.loadSerivice.getLoadByShipperIDUsingJPQL(shipperId);
	}
	
	
	
	// Getting single load by loadID
	
	@GetMapping("/load/{loadLoadId}")
	public Load getloadid(@PathVariable String loadLoadId)
	{
		return this.loadSerivice.getloadid(Long.parseLong(loadLoadId));
	}
	
	
	
	//Updating load by Load Id if LoadId is not match then new load will be added 
	
	@PutMapping("/load/{loadLoadId}")
	public Load updateLoad(@RequestBody Load load) {
		
		return this.loadSerivice.updateLoad(load);
		
	}
	
	
	
	//Deleting load by LoadId
	
	@DeleteMapping("/load/{loadLoadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadLoadId){
		try {
			this.loadSerivice.deleteLoad(Long.parseLong(loadLoadId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
}

