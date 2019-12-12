package com.bankaccount.service;

import com.bankaccount.model.BankAccountModel;

import reactor.core.publisher.Mono;

public interface BankAccountServiceInterface {

	Mono<BankAccountModel> insertBankAccount(BankAccountModel bankAccountModel);
}
