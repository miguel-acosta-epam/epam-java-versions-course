package com.epam.jmp.application;

import com.epam.bank.api.Bank;
import com.epam.jmp.cloud.bank.impl.CloudBankImpl;
import com.epam.jmp.cloud.service.impl.CloudServiceImpl;
import com.epam.jmp.dto.BankCard;
import com.epam.jmp.dto.BankCardType;
import com.epam.jmp.dto.Subscription;
import com.epam.jmp.dto.User;
import com.epam.jmp.service.api.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) {
    Bank bank = new CloudBankImpl();
    Service service = new CloudServiceImpl();

    User user1 = new User("John", "Doe", LocalDate.of(1990, 1, 1));
    User user2 = new User("Carl", "Coleman", LocalDate.of(1996, 1, 1));

    // Create a bank card
    BankCard creditCard = bank.createBankCard(user1, BankCardType.CREDIT);
    creditCard.setNumber("44010203929200");

    BankCard debitCard = bank.createBankCard(user2, BankCardType.DEBIT);
    creditCard.setNumber("42133213213333");

    service.subscribe(creditCard);
    service.subscribe(debitCard);

    var subscription = service.getSubscriptionByBankCardNumber(creditCard.getNumber());
    subscription.ifPresent(System.out::println);

    List<User> allUsers = service.getAllUsers();
    allUsers.forEach(System.out::println);
  }
}
