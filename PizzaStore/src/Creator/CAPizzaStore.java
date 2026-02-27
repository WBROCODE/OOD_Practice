package Creator;

import IngredientCreator.CAFactory;
import IngredientCreator.IngredientFactory;
import Products.*;

public class CAPizzaStore extends PizzaStore{

    Pizza pizza = null;
    IngredientFactory caFactory = new CAFactory();
    @Override
    Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza = new CAStyleCheesePizza();
            pizza.setName("CA Style Cheese Pizza");

        }else if(type.equals("veggie")){
            pizza = new CAStyleViggiePizza();
            pizza.setName("CA Style Veggie Pizza");
        }

        return pizza;
    }
}
