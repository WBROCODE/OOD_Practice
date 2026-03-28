package Cinemas.Layout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Cinemas.Seats.Seats;
import Orders.PricingStrategy.NornalPrice;

public class Layout {
    private final int col;
    private final int row;
    private final Map<String, Seats> seatsByNumber;
    private final Map<Integer, Map<Integer, Seats>> seatsByPositions;

    public Layout(int col, int row){
        this.col = col;
        this.row = row;
        seatsByNumber = new HashMap<>();
        seatsByPositions = new HashMap<>();
        initLayout();
    }
    // init layout
    public void initLayout(){
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                String seatNumber = i + "-" + j;
                addSeat(i, j, seatNumber, new Seats(seatNumber, new NornalPrice(1.0)));
            }
        }
    }
    // add Seats
    public void addSeat(int x, int y, String seatNumber, Seats seat){
        seatsByNumber.put(seatNumber, seat);
        seatsByPositions.computeIfAbsent(x, k->new HashMap<>()).put(y, seat);
    }

    // getter
    public Seats getSeatsByNumber(String seatNumber){
        return seatsByNumber.get(seatNumber);
    }

    // getter
    public Seats getSeatsByPositions(int x, int y){
        return seatsByPositions.get(x).get(y);
    }

    // find all seats
    public List<Seats> findAllSeats(){
        return List.copyOf(seatsByNumber.values());
    }
}
