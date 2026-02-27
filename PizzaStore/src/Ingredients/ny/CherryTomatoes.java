package Ingredients.ny;

import Ingredients.Veggie;

public class CherryTomatoes implements Veggie {
    private final String description = "Cherry Tomatoes";
    @Override
    public String getDescription() {
        return description;
    }
}
