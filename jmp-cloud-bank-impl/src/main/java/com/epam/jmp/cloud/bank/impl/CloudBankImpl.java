package com.epam.jmp.cloud.bank.impl;

import com.epam.bank.api.Bank;
import com.epam.jmp.dto.*;

public class CloudBankImpl implements Bank {
  @Override
  public BankCard createBankCard(User user, BankCardType cardType) {
    switch (cardType) {
      case CREDIT:
        return new CreditBankCard("", user);
      case DEBIT:
        return new DebitBankCard("", user);
      default:
        throw new IllegalArgumentException("Unsupported card type: " + cardType);
    }
  }
}
