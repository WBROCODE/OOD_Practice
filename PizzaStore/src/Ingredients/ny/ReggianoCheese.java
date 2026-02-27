package Ingredients.ny;
import Ingredients.Cheese;

public class ReggianoCheese implements Cheese {
    private final String description = "Reggiano Cheese";
    @Override
    public String getDescription() {
        return description;
    }
}
