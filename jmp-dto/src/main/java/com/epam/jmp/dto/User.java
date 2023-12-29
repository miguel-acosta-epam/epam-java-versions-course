package com.epam.jmp.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
  private String name;
  private String surname;
  private LocalDate birthday;

  public User(String name, String surname, LocalDate birthday) {
    this.name = name;
    this.surname = surname;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "Nombre: "
        + getName()
        + ", Apellido: "
        + getSurname()
        + ", Fecha nacimiento: "
        + birthday.format(DateTimeFormatter.ISO_LOCAL_DATE);
  }
}
