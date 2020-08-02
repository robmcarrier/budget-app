package com.robmcarrier.budgetapp.services;

import com.robmcarrier.budgetapp.models.Income;
import reactor.core.publisher.Flux;

public interface IncomeService {

  Flux<Income> getIncome();
}
