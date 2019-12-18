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

	/* Function to update the total amount through the account number */
	@Override
	public Mono<BankAccountModel> updateAmountBankAccount(BankAccountModel bankAccountModel, String accountNumber, Double amount) {
		
		return bankAccountRepositoryInterface.findByAccountNumber(accountNumber)
				.flatMap(newBankAccountModel -> {
					newBankAccountModel.setAmount(bankAccountModel.getAmount());
					return bankAccountRepositoryInterface.save(newBankAccountModel);
				});
						
	}
}
