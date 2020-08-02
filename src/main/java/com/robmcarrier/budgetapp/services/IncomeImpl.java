package com.robmcarrier.budgetapp.services;

import com.robmcarrier.budgetapp.models.Income;
import com.robmcarrier.budgetapp.repositories.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class IncomeImpl implements IncomeService {

  private final IncomeRepository incomeRepository;

  @Override
  public Flux<Income> getIncome() {
    return incomeRepository.findAll();
  }
}
