package com.epam.jmp.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Subscription {
  private String bankcard;
  private LocalDate startDate;

  public String getBankcard() {
    return bankcard;
  }

  public void setBankcard(String bankcard) {
    this.bankcard = bankcard;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  @Override
  public String toString() {
    return "Card number: "
        + bankcard
        + ", subscription date: "
        + startDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
  }
}
