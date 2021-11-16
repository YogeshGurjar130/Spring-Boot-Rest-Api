package com.yogesh.loadApi.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yogesh.loadApi.models.Loading;
import com.yogesh.loadApi.repository.LoadRepository;



@Service
public class LoadService {
    
	@Autowired
	private LoadRepository repository; 
	
	public void save(Loading loading) {
		repository.save(loading);
	}
	
	public List<Loading> findAllByShip(long shipperId){
		return repository.getAllByShipperId(shipperId);
		 
	}
	
	public List<Loading> findAll(){
		return repository.findAll();
	}
	
	public Optional<Loading> findById(long loadId) {
		return repository.findById(loadId);
	}
	
	public void delete(long loadId){
		repository.deleteById(loadId);
	}
	
}
