package Ingredients.ny;

import Ingredients.Veggie;

public class Carrots implements Veggie {
    private final String description = "Carrots";
    @Override
    public String getDescription() {
        return description;
    }
}
