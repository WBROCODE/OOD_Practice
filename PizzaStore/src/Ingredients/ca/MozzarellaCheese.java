package Ingredients.ca;
import Ingredients.Cheese;

public class MozzarellaCheese implements Cheese {
    private final String description = "Mozzarella Cheese";
    @Override
    public String getDescription() {
        return description;
    }
}
