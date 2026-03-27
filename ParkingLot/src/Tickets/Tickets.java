package Tickets;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

import ParkingSpots.ParkingSpots;
import Vehicles.Vehicles;

public class Tickets {
    private final String ticketId;
    private final Vehicles vehicle;
    private final ParkingSpots ParkingLot;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Tickets(String ticketId, Vehicles vehicle, ParkingSpots parkingLot, LocalDateTime entryTime){
            this.ticketId = ticketId;
            this.vehicle = vehicle;
            this.ParkingLot = parkingLot;
            this.entryTime = entryTime;
    }

    public BigDecimal calculateDuration(){
        return new BigDecimal(
            Duration.between(
                            entryTime,
                            Objects.requireNonNullElseGet(exitTime, LocalDateTime::now))
                    .toMinutes());
    }

    public Vehicles getVehicles(){
        return this.vehicle;
    }

    public ParkingSpots getParkinglot(){
        return this.ParkingLot;
    }

    public LocalDateTime getEntryTime(){
        return this.entryTime;
    }

    public LocalDateTime getExitTime(){
        return this.exitTime;
    }

    public void setExitTime(LocalDateTime time){
        this.exitTime = time;
    }

}
