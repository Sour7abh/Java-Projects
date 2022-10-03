package com.simplilearn.icin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.icin.model.Saccount;

public interface SaccountRepository extends JpaRepository<Saccount, Integer>{
	
	public Saccount findByUsername(String username);
	public Saccount findByAccno(long accno);

}
