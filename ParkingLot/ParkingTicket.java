package org.example.SystemDesign.ParkingLot;

import org.example.SystemDesign.ParkingLot.EntranceExit.Entrance;
import org.example.SystemDesign.ParkingLot.EntranceExit.Exit;
import org.example.SystemDesign.ParkingLot.Payment.Payment;
import org.example.SystemDesign.ParkingLot.Vehicle.Vehicle;

import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date timestamp;
    private Date exit;
    private double amount;
    private boolean status;

    // Following are the instances of their respective classes
    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exitIns;
}