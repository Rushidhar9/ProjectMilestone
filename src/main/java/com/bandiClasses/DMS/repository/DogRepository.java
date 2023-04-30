package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bandiClasses.DMS.Models.Dog;

/**
* 
* @author Rushidhar Reddy Sheelam
*/
@Repository
public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog> findByName(String name);

}
