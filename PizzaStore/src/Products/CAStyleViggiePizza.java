package Products;

import IngredientCreator.CAFactory;
import IngredientCreator.IngredientFactory;
import Ingredients.Veggie;
import Ingredients.ca.BellPepper;
import Ingredients.ca.Mushrooms;
import Ingredients.ny.MarinaraSauce;
import Ingredients.ny.ThinCrustDough;
import java.util.ArrayList;

public class CAStyleViggiePizza extends Pizza{
    private final IngredientFactory factory;

    public CAStyleViggiePizza(){
        // factory
        factory = new CAFactory();
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
