package org.example.SystemDesign.ParkingLot.ParkingSpot;

import org.example.SystemDesign.ParkingLot.Vehicle.Vehicle;

public class Compact extends ParkingSpot {

  @Override
  public boolean assignVehicle(Vehicle vehicle) {
    return false;
  }
}