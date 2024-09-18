package org.example.SystemDesign.ParkingLot.EntranceExit;

import org.example.SystemDesign.ParkingLot.ParkingTicket;

public class Entrance {
  // Data members 
  private int id;

  // Member function
  public ParkingTicket getTicket(){
    return new ParkingTicket();
  }
}

