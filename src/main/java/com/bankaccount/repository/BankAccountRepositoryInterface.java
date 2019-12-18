package com.bankaccount.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bankaccount.model.BankAccountModel;

import reactor.core.publisher.Mono;

@Repository
public interface BankAccountRepositoryInterface extends ReactiveMongoRepository<BankAccountModel, String>{

	Mono<BankAccountModel> findByAccountNumber(String accountNumber);
}
