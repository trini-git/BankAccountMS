package com.bankaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankaccount.model.MainModel;
import com.bankaccount.service.MainModelService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/main-model")
public class MainModelController {
	
	@Autowired
	MainModelService mainModelService;
	
	@GetMapping("/find-by/{accountNumber}")
	public Mono<MainModel> findByAccountNumber (@PathVariable String accountNumber){
		return mainModelService.findByAccountNumber(accountNumber);
		
	}
}
