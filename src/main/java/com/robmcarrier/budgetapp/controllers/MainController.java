package com.robmcarrier.budgetapp.controllers;

import com.robmcarrier.budgetapp.models.Income;
import com.robmcarrier.budgetapp.services.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class MainController {

  private final IncomeService incomeService;

  @GetMapping(path = "/")
  public Flux<Income> get() {
    return incomeService.getIncome();
  }
}
