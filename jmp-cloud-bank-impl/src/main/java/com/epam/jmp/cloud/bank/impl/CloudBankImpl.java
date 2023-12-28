package com.epam.jmp.cloud.bank.impl;

import com.epam.bank.api.Bank;
import com.epam.jmp.dto.*;

public class CloudBankImpl implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType cardType) {
        if (cardType == BankCardType.CREDIT) {
            return new CreditBankCard();  // Implement CreditBankCard constructor if needed
        } else if (cardType == BankCardType.DEBIT) {
            return new DebitBankCard();  // Implement DebitBankCard constructor if needed
        } else {
            throw new IllegalArgumentException("Unsupported card type: " + cardType);
        }
    }
}
