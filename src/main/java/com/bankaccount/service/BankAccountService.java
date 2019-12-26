package com.bankaccount.service;

import com.bankaccount.model.BankAccountModel;
import com.bankaccount.repository.BankAccountRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BankAccountService implements BankAccountServiceInterface {

  @Autowired
  BankAccountRepositoryInterface bankAccountRepositoryInterface;
  
  public Mono<BankAccountModel> findByAccountNumber(String accountNumber) {
    return bankAccountRepositoryInterface.findByAccountNumber(accountNumber);
  }

  @Override
  public Mono<BankAccountModel> insertBankAccount(BankAccountModel bankAccountModel) {
    return bankAccountRepositoryInterface.save(bankAccountModel);
  }

  @Override
  public Mono<BankAccountModel> updateAmount(BankAccountModel newBankAccountModel) {
    return bankAccountRepositoryInterface.findByAccountNumber(newBankAccountModel.getAccountNumber())
.flatMap(oldBankAccountModel -> {
  oldBankAccountModel.setAmount(newBankAccountModel.getAmount());
  return bankAccountRepositoryInterface.save(oldBankAccountModel);
});
  }
}
