package com.yogesh.loadApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yogesh.loadApi.models.Loading;

@Repository
public interface LoadRepository extends JpaRepository<Loading, Long>{
	
	public List<Loading> getAllByShipperId(long shipperId);
	
}
