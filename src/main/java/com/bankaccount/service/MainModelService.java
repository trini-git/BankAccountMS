package com.bankaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankaccount.model.MainModel;
import com.bankaccount.repository.IMainModelRepository;

import reactor.core.publisher.Mono;

@Service
public class MainModelService implements IMainModelService {
	
	@Autowired
	IMainModelRepository iMainModelRepository;
	
	public Mono<MainModel> findByAccountNumber(String accountNumber) {
	    return iMainModelRepository.findByAccountNumber(accountNumber);
	  }
	
}
