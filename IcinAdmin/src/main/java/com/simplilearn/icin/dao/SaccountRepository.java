package com.simplilearn.icin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.icin.model.Saccount;

@Repository
public interface SaccountRepository extends JpaRepository<Saccount, Integer>{
	
	public Saccount findByAccno(long accNo);

}
