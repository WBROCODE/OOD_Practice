package FareCalculator;

import java.math.BigDecimal;

import Tickets.Tickets;

public interface FareStrategy {
    BigDecimal calculateFare(Tickets tickets, BigDecimal input);
}
