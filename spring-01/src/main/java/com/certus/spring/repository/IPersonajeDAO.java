package com.certus.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.certus.spring.models.Personaje;

@Repository
public interface IPersonajeDAO extends CrudRepository<Personaje, Integer> {
	
	

}
