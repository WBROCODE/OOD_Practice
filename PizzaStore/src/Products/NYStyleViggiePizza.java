package Products;

import IngredientCreator.IngredientFactory;
import IngredientCreator.NYFactory;
import Ingredients.Veggie;
import Ingredients.ca.BellPepper;
import Ingredients.ca.Mushrooms;
import Ingredients.ny.*;

import java.util.ArrayList;

public class NYStyleViggiePizza extends Pizza{
    private final IngredientFactory factory;
    public NYStyleViggiePizza(){
        // factory
        factory = new NYFactory();

    }
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
    @Override
    public void prepare(){
        // add ingrediente
        System.out.println("Preparing " + name);

        dough = factory.createDough();
        sauce = factory.createSauce();

        // veggie
        veggies = factory.createVeggies();

        System.out.println("Tossing dough: " + dough.getDescription());
        System.out.println("Adding sauce: " + sauce.getDescription());

        for(Veggie v : veggies){
            System.out.println("Adding veggie: " + v.getDescription());
        }
    }
}
