package IngredientCreator;

import Ingredients.*;
import Ingredients.ny.*;

import java.util.ArrayList;
import java.util.List;


public class NYFactory implements IngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public List<Veggie> createVeggies(){
        List<Veggie> veggies = new ArrayList<>();
        veggies.add(new Carrots());
        veggies.add(new CherryTomatoes());
        return veggies;
    }

}
