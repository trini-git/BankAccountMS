package com.bankaccount.repository;

import com.bankaccount.model.FixedTermVipModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IFixedTermVipRepository extends ReactiveMongoRepository
    <FixedTermVipModel, String> {

  Mono<FixedTermVipModel> findByAccountNumber(String accountNumber);

}
