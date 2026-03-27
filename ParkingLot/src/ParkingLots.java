import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import FareCalculator.FareCalculator;
import ParkingLotsManager.ParkingLotsManager;
import ParkingSpots.ParkingSpots;
import Tickets.Tickets;
import Vehicles.Vehicles;

public class ParkingLots {
    ParkingLotsManager pm;
    FareCalculator fc;

    public ParkingLots(ParkingLotsManager pm, FareCalculator fc){
        this.pm = pm;
        this.fc = fc;
    }

    public Tickets enterVehicle(Vehicles vehicle){
        ParkingSpots spot = pm.findParkingLots(vehicle);
        if(spot != null){
            Tickets ticket = new Tickets(generateTicketId(), vehicle, spot, LocalDateTime.now());
            return ticket;
        }
        return null;
    }

    public void leaveVehicle(Tickets ticket){
        if(ticket != null && ticket.getExitTime() != null){
            ticket.setExitTime(LocalDateTime.now());
            pm.unpark(ticket.getVehicles());
            BigDecimal fare = fc.calculateFare(ticket);
        }else{
            
        }
    }

    public String generateTicketId(){
        return UUID.randomUUID().toString();
    }
}
