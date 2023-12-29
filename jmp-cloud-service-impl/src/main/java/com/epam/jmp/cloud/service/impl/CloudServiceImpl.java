package com.epam.jmp.cloud.service.impl;

import com.epam.jmp.dto.BankCard;
import com.epam.jmp.dto.Subscription;
import com.epam.jmp.dto.User;
import com.epam.jmp.service.api.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CloudServiceImpl implements Service {
  private final List<User> users = new ArrayList<>();
  private final List<Subscription> subscriptions = new ArrayList<>();

  @Override
  public void subscribe(BankCard bankCard) {
    var subscription = new Subscription();
    subscription.setBankcard(bankCard.getNumber());
    subscription.setStartDate(LocalDate.now());
    subscriptions.add(subscription);

    users.add(bankCard.getUser());
  }

  @Override
  public Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber) {
    return subscriptions.stream()
        .filter(subscription -> subscription.getBankcard().equals(bankCardNumber))
        .findFirst();
  }

  @Override
  public List<User> getAllUsers() {
    return users.stream().collect(Collectors.toList());
  }
}
