package Ingredients.ny;

import Ingredients.Dough;

public class ThinCrustDough implements Dough {
    private String description = "Thin Crust Dough";
    @Override
    public String getDescription() {
        return description;
    }
}
