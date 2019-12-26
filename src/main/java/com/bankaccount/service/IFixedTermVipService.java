package com.bankaccount.service;

import com.bankaccount.model.FixedTermVipModel;
import reactor.core.publisher.Mono;

public interface IFixedTermVipService {

  Mono<FixedTermVipModel> insertBankAccount(FixedTermVipModel fixedTermVipModel);

  Mono<FixedTermVipModel> updateAmount(FixedTermVipModel fixedTermVipModel);

}
