package com.simplilearn.icin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.icin.model.ChequebookRequest;

@Repository
public interface ChequeBookRepository extends JpaRepository<ChequebookRequest, Integer>{
	
	public List<ChequebookRequest> findByAccount(long account);

}
