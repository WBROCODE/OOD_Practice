package ScreeningManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Cinemas.Cinema;
import Cinemas.Movie.Movie;
import Cinemas.Screening.Screening;
import Cinemas.Seats.Seats;
import Orders.Tickets.Ticket;

public class MovieBookingSystem {
    private final List<Movie> movies;
    private final List<Cinema> Cinemas;
    private final ScreeningManager sm;

    public MovieBookingSystem(){
        this.movies = new ArrayList<>();
        this.Cinemas = new ArrayList<>();
        sm = new ScreeningManager();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void addCinema(Cinema cinema){
        Cinemas.add(cinema);
    }

    public void addScreening(Movie movie, Screening sc){
        sm.addScreening(movie, sc);
    }

    public void bookTicket(Screening sc, Seats seats){
        if(!sm.checkBooked(sc, seats)){
            double price = seats.getPrice();
            Ticket ticket = new Ticket(generateTicketId(), sc, seats, price);
            sm.addTicket(sc, ticket);
        }
    }

    // get Screening
    public List<Screening> getAllScreenings(Movie movie){
        return sm.getScreenings(movie);
    }
    // get seats
    public List<Seats> getAllSeats(Screening sc){
        return sm.getAllSeat(sc);
    }    
    // get ticket
    public List<Ticket> getAllTickets(Screening sc){
        return sm.getTickets(sc);
    }

    // generate ID
    public String generateTicketId(){
        return UUID.randomUUID().toString();
    }
}
