package com.simplilearn.icin.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.icin.model.Transfer;


@Repository
public interface TransferRepository extends CrudRepository<Transfer, Integer> {
	
	public List<Transfer> findBySaccount(long saccount);
	public List<Transfer> findByRaccount(long racoount);
}
