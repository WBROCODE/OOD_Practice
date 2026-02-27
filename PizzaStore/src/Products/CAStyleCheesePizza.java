package Products;

import IngredientCreator.CAFactory;
import IngredientCreator.IngredientFactory;
import Ingredients.Veggie;
import Ingredients.ca.MozzarellaCheese;
import Ingredients.ny.MarinaraSauce;
import Ingredients.ny.ReggianoCheese;
import Ingredients.ny.ThinCrustDough;

public class CAStyleCheesePizza extends Pizza{
    private final IngredientFactory factory;
    public CAStyleCheesePizza(){
        // factory
        factory = new CAFactory();
    }

    public void prepare(){
        // add ingrediente
        System.out.println("Preparing " + name);
        // factory manufature these
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();

        System.out.println("Tossing dough: " + dough.getDescription());
        System.out.println("Adding sauce: " + sauce.getDescription());
        System.out.println("Adding Cheese: " + cheese.getDescription());
    }

}
