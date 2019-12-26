package com.bankaccount.service;

import com.bankaccount.model.CreditCardModel;

import reactor.core.publisher.Mono;

public interface ICreditCardService {

  Mono<CreditCardModel> insertCreditCard(CreditCardModel creditCardModel);
  
  Mono<CreditCardModel> updateAmount(CreditCardModel creditCardModel);
    
}
