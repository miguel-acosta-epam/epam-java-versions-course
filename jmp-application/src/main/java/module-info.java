 module jmp.application {
  uses com.epam.bank.api.Bank;
  uses com.epam.jmp.service.api.Service;

  requires jmp.bank.api;
  requires jmp.service.api;
  requires jmp.dto;
  requires jmp.cloud.bank.impl;
  requires jmp.cloud.service.impl;
 }