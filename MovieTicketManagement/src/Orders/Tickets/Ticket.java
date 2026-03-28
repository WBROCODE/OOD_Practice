package Orders.Tickets;

import java.math.BigDecimal;
import java.util.UUID;

import Cinemas.Screening.Screening;
import Cinemas.Seats.Seats;

public class Ticket {
    private final String ticketId;
    private final Screening screening;
    private final Seats seat;
    private final double price;

    public Ticket(String ticketId, Screening sc, Seats seat, double price){
        this.ticketId = ticketId;
        this.screening = sc;
        this.seat = seat;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public Seats getSeat(){
        return seat;
    }
}
