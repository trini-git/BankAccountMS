package com.bankaccount.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bankaccount.model.MainModel;

import reactor.core.publisher.Mono;

@Repository
public interface IMainModelRepository extends ReactiveMongoRepository<MainModel, String>{

	Mono<MainModel> findByAccountNumber(String accountNumber);
}
