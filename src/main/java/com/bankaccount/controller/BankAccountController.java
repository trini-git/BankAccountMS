package com.bankaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankaccount.model.BankAccountModel;
import com.bankaccount.service.BankAccountService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bank-account")
public class BankAccountController {
	
	@Autowired
	BankAccountService bankAccountService;
	
	@PostMapping("/insert")
	public Mono<BankAccountModel> insertBankAccount(@RequestBody BankAccountModel bankAccountModel){
		
		return bankAccountService.insertBankAccount(bankAccountModel);
	}
}
