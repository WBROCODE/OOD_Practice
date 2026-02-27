package IngredientCreator;

import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Veggie;
import Ingredients.ca.BellPepper;
import Ingredients.ca.MozzarellaCheese;
import Ingredients.ca.Mushrooms;
import Ingredients.ny.MarinaraSauce;
import Ingredients.ny.ThinCrustDough;

import java.util.ArrayList;
import java.util.List;

public class CAFactory implements IngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    public List<Veggie> createVeggies(){
        List<Veggie> veggies = new ArrayList<>();
        veggies.add(new Mushrooms());
        veggies.add(new BellPepper());
        return veggies;
    }
}
