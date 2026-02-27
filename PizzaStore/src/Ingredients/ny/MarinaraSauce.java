package Ingredients.ny;

import Ingredients.Sauce;

public class MarinaraSauce implements Sauce {

    private final String description = "Marinara Sauce";

    @Override
    public String getDescription() {
        return description;
    }
}
