package Ingredients.ca;

import Ingredients.Veggie;

public class BellPepper implements Veggie {
    private final String description = "Bell Pepper";
    @Override
    public String getDescription() {
        return description;
    }
}
