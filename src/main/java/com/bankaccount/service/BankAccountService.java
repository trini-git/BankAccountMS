package com.bankaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankaccount.model.BankAccountModel;
import com.bankaccount.repository.BankAccountRepositoryInterface;

import reactor.core.publisher.Mono;

@Service
public class BankAccountService implements BankAccountServiceInterface {

	@Autowired
	BankAccountRepositoryInterface bankAccountRepositoryInterface;

	@Override
	public Mono<BankAccountModel> insertBankAccount(BankAccountModel bankAccountModel) {

		return bankAccountRepositoryInterface.save(bankAccountModel);
	}

	@Override
	public Mono<BankAccountModel> updateAmount(BankAccountModel newBankAccountModel) {
		
		return bankAccountRepositoryInterface.findByAccountNumber(newBankAccountModel.getAccountNumber())
				.flatMap(oldBankAccountModel -> {
					oldBankAccountModel.setAmount(newBankAccountModel.getAmount());
					return bankAccountRepositoryInterface.save(oldBankAccountModel);
				});
	}
}
