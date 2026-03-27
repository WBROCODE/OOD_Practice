package FareCalculator;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import Tickets.Tickets;

public class PeakHourStrategy implements FareStrategy{
    private static final BigDecimal PEAK_HOURS_MULTIPLIER = new BigDecimal("1.5");

    public PeakHourStrategy() {}

    @Override
    public BigDecimal calculateFare(Tickets tickets, BigDecimal input){
        BigDecimal fare = input;
        if (isPeakHours(tickets.getEntryTime())) {
            fare = fare.multiply(PEAK_HOURS_MULTIPLIER);
        }
        return fare;
    }

    private boolean isPeakHours(LocalDateTime time) {
        int hour = time.getHour();
        return (hour >= 7 && hour <= 10) || (hour >= 16 && hour <= 19);
    }
}
