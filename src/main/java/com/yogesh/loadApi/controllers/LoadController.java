package com.yogesh.loadApi.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
import com.yogesh.loadApi.models.Loading;
import com.yogesh.loadApi.services.LoadService;

@RestController
public class LoadController {
	
	@Autowired
	LoadService loadRepo;
	
	@PostMapping("/load")
	public String addLoad(@RequestBody Loading loading) {
		loadRepo.save(loading);
		return "loading details added successfully";
	}
	
	@GetMapping("/allLoads")
	public List<Loading> findAllLoad(){
		return loadRepo.findAll();
	}
	
	@GetMapping("/load/{loadId}")
	public Optional<Loading> find(@PathVariable long loadId) {
		return loadRepo.findById(loadId);
	}
	
	@PutMapping("/load/{loadId}")
	public ResponseEntity<?> update(@RequestBody Loading loading, @PathVariable Long loadId) {
	    try {
	        loadRepo.save(loading);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/delete/{loadId}")
	public void deleteById(@PathVariable long loadId) {
		loadRepo.delete(loadId);
	}
	
	@GetMapping("/loads")
	public List<Loading> findAllById (@RequestParam long shipperId){
		 return loadRepo.findAllByShip(shipperId);
	}
	
}
