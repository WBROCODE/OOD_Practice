package ScreeningManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import Cinemas.Movie.Movie;
import Cinemas.Screening.Screening;
import Cinemas.Seats.Seats;
import Orders.Tickets.Ticket;

public class ScreeningManager {
    Map<Movie, List<Screening>> screeningByMovie;
    Map<Screening, List<Ticket>> ticketByScreening;
    Map<Screening, HashSet<String>> seatsByScreening;

    public ScreeningManager(){
        this.screeningByMovie = new HashMap<>();
        this.ticketByScreening = new HashMap<>();
        this.seatsByScreening = new HashMap<>();
    }

    public void addScreening(Movie movie, Screening sc){
        screeningByMovie.computeIfAbsent(movie, k -> new ArrayList<>()).add(sc);
    }

    public void addTicket(Screening sc, Ticket ticket){
        ticketByScreening.computeIfAbsent(sc, k-> new ArrayList<>()).add(ticket);
        seatsByScreening.computeIfAbsent(sc, k-> new HashSet<>()).add(ticket.getTicketId());
    }

    // check booked
    public boolean checkBooked(Screening sc, Seats seats){
        if(seatsByScreening.get(sc) == null) return false;
        return seatsByScreening.get(sc).contains(seats);
    }

    // get all ticket
    public List<Ticket> getTickets(Screening sc){
        return ticketByScreening.getOrDefault(sc, new ArrayList<>());
    }

    // get all screening
    public List<Screening> getScreenings(Movie movie){
        return screeningByMovie.getOrDefault(movie, new ArrayList<>());
    }
    // get All seats
    public List<Seats> getAllSeat(Screening sc){
        List<Seats> allSeats = sc.getRoom().getLayout().findAllSeats();
        List<Ticket> bookedTickets = getTickets(sc);
        List<Seats> availableSeats = new ArrayList<>(allSeats);

        for(Ticket ticket : bookedTickets){
            availableSeats.remove(ticket.getSeat());
        }

        return availableSeats;
    }
}
