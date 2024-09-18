package org.example.SystemDesign.ParkingLot.Account;

import org.example.SystemDesign.ParkingLot.DisplayBoardParkingRate.DisplayBoard;
import org.example.SystemDesign.ParkingLot.EntranceExit.Entrance;
import org.example.SystemDesign.ParkingLot.EntranceExit.Exit;
import org.example.SystemDesign.ParkingLot.ParkingSpot.ParkingSpot;

public class Admin extends Account {
  // spot here refers to an instance of the ParkingSpot class
  public boolean addParkingSpot(ParkingSpot spot){
    return false;
  }
  // displayBoard here refers to an instance of the DisplayBoard class
  public boolean addDisplayBoard(DisplayBoard displayBoard){
    return false;
  }
  // entrance here refers to an instance of the Entrance class
  public boolean addEntrance(Entrance entrance){
    return false;
  }
  // exit here refers to an instance of the Exit class
  public boolean addExit(Exit exit){
    return false;
  }

  // Will implement the functionality in this class
  public boolean resetPassword() {
    // definition
    return true;
  }
}