package org.example.SystemDesign.ParkingLot.Account;

import org.example.SystemDesign.ParkingLot.AccountStatus;
import org.example.SystemDesign.ParkingLot.Person;

public abstract class Account {
  // Data members
  private String userName;
  private String password;
  private Person person; // Refers to an instance of the Person class
  private AccountStatus status; // Refers to the AccountStatus enum

  public abstract boolean resetPassword();
}