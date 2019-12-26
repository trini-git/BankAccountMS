package com.bankaccount.controller;

import com.bankaccount.model.BankAccountModel;
import com.bankaccount.model.CreditCardModel;
import com.bankaccount.service.BankAccountService;
import com.bankaccount.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit-card")
public class CreditCardController {
  
  @Autowired
  CreditCardService creditCardService;
  
  @Autowired
  BankAccountService bankAccountService;
  
  @PostMapping("/insert")
  public Mono<CreditCardModel> insertCreditCardModel(@RequestBody CreditCardModel creditCardModel) {
    
    return creditCardService.insertCreditCard(creditCardModel);
    
  }
  
  @PutMapping("/update-amount")
  public Mono<CreditCardModel> updateAmount(@RequestBody CreditCardModel creditCardModel) {
    
    return creditCardService.updateAmount(creditCardModel);
    
  }
  
}
