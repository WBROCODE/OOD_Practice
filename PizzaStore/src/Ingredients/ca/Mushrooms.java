package Ingredients.ca;

import Ingredients.Veggie;

public class Mushrooms implements Veggie {
    private final String description = "Mushrooms";
    @Override
    public String getDescription() {
        return description;
    }
}
