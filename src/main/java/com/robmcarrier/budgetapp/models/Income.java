package com.robmcarrier.budgetapp.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "income")
@Data
public class Income {

  private String name;
  private int amount;
  private String frequency;
}
