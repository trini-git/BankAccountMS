package com.bankaccount.repository;

import com.bankaccount.model.CreditCardModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCardModel, String> {

  Mono<CreditCardModel> findByCreditCardNumber(String creditCardNumber);
}
