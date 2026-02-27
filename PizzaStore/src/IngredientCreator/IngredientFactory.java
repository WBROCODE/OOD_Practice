package IngredientCreator;

import Ingredients.*;

import java.util.List;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggie> createVeggies();
}
