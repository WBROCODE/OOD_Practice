package Products;

import IngredientCreator.IngredientFactory;
import IngredientCreator.NYFactory;
import Ingredients.Veggie;
import Ingredients.ny.MarinaraSauce;
import Ingredients.ny.ReggianoCheese;
import Ingredients.ny.ThinCrustDough;

public class NYStyleCheesePizza extends Pizza{
    private final IngredientFactory factory;
    public NYStyleCheesePizza(){
        factory = new NYFactory();
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
