package com.bankaccount.controller;

import com.bankaccount.model.BankAccountModel;
import com.bankaccount.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bank-account")
public class BankAccountController {

  @Autowired
  BankAccountService bankAccountService;
  
  @GetMapping("/find-by/{accountNumber}")
  public Mono<BankAccountModel> findByAccountNumber(@PathVariable String accountNumber) {
    return bankAccountService.findByAccountNumber(accountNumber);
  }

  @PostMapping("/insert")
  public Mono<BankAccountModel> insertBankAccount(@RequestBody BankAccountModel bankAccountModel) {
    return bankAccountService.insertBankAccount(bankAccountModel);
  }

  @PutMapping("/update-amount")
  public Mono<BankAccountModel> updateAmount(@RequestBody BankAccountModel bankAccountModel) {
    return bankAccountService.updateAmount(bankAccountModel);
  }
}


