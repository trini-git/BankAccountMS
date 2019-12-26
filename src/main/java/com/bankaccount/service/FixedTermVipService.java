package com.bankaccount.service;

import com.bankaccount.model.FixedTermVipModel;
import com.bankaccount.repository.IFixedTermVipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FixedTermVipService implements IFixedTermVipService {

  @Autowired
  IFixedTermVipRepository iFixedTermVipRepository;

  @Override
  public Mono<FixedTermVipModel> insertBankAccount(FixedTermVipModel fixedTermVipModel) {
    return iFixedTermVipRepository.save(fixedTermVipModel);
  }

  @Override
  public Mono<FixedTermVipModel> updateAmount(FixedTermVipModel newFixedTermVipModel) {
    return iFixedTermVipRepository.findByAccountNumber(newFixedTermVipModel.getAccountNumber())
.flatMap(oldFixedTermVipModel -> {
  oldFixedTermVipModel.setCurrentAmount(newFixedTermVipModel.getCurrentAmount());
  oldFixedTermVipModel.setNumberOfMovement(newFixedTermVipModel.getNumberOfMovement());
  return iFixedTermVipRepository.save(oldFixedTermVipModel);
});
  }
}
