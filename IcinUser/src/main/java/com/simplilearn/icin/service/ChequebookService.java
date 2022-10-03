package com.simplilearn.icin.service;

import java.util.List;

import com.simplilearn.icin.model.ChequebookRequest;
import com.simplilearn.icin.response.ChequeResponse;



public interface ChequebookService {
	
	public ChequeResponse createrequest(ChequebookRequest chequebook);
	public List<ChequebookRequest> getRequests(long account);

}
