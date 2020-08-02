package com.robmcarrier.budgetapp.repositories;

import com.robmcarrier.budgetapp.models.Income;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IncomeRepository extends ReactiveMongoRepository<Income, String> {

  Flux<Income> findByAmount(int Amount);
}
