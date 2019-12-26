package com.bankaccount.service;

import com.bankaccount.model.CreditCardModel;
import com.bankaccount.repository.ICreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CreditCardService implements ICreditCardService {

  @Autowired
  ICreditCardRepository iCreditCardRepository;

  @Override
  public Mono<CreditCardModel> insertCreditCard(CreditCardModel creditCardModel) {
    
    return iCreditCardRepository.save(creditCardModel);
  }

  @Override
  public Mono<CreditCardModel> updateAmount(CreditCardModel newCreditCardModel) {

    return iCreditCardRepository.findByCreditCardNumber(newCreditCardModel.getCreditCardNumber())
    .flatMap(oldCreditCardModel -> {
      oldCreditCardModel.setAvalibleAmount(newCreditCardModel.getAvalibleAmount());
      return iCreditCardRepository.save(oldCreditCardModel);
    });
  }
  
}
