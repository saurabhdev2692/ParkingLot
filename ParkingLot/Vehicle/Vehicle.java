package org.example.SystemDesign.ParkingLot.Vehicle;

import org.example.SystemDesign.ParkingLot.ParkingTicket;

// Vehicle is an abstract class
public abstract class Vehicle {
  private int licenseNo;
  public abstract void assignTicket(ParkingTicket ticket);
}


