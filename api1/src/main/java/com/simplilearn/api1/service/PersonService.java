package com.simplilearn.api1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.api1.entity.PersonEntity;
import com.simplilearn.api1.repo.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repo;
	
	public PersonEntity addPerson(PersonEntity entity) {
		return repo.save(entity);
	}
	public List<PersonEntity> getAll(){
		return repo.findAll();
	}

}
