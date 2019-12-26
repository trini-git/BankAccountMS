package com.bankaccount.controller;

import com.bankaccount.model.FixedTermVipModel;
import com.bankaccount.service.FixedTermVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bank-account-vip")
public class FixedTermVipController {

  @Autowired
  FixedTermVipService fixedTermVipService;

  @PostMapping("/insert-vip")
  public Mono<FixedTermVipModel> insertBankAccount(@RequestBody FixedTermVipModel fixedTermVipModel) {
    return fixedTermVipService.insertBankAccount(fixedTermVipModel);
  }

  @PutMapping("/update-amount-vip")
  public Mono<FixedTermVipModel> updateAmount(@RequestBody FixedTermVipModel fixedTermVipModel) {
    return fixedTermVipService.updateAmount(fixedTermVipModel);
  }

}
