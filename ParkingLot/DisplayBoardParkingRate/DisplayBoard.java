package org.example.SystemDesign.ParkingLot.DisplayBoardParkingRate;

import org.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpot;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
  // Data members
  private int id;
  private Map<String, List<ParkingSpot>> parkingSpots;

  // Constructor
  public DisplayBoard(int id) {
    this.id = id;
    this.parkingSpots = new HashMap<>();
  }
  
  // Member function
  public void addParkingSpot(String spotType, List<ParkingSpot> spots){
    return;

  }
  public void showFreeSlot(){
    return;
  }
}

