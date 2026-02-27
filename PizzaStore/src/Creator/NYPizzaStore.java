package Creator;

import IngredientCreator.IngredientFactory;
import IngredientCreator.NYFactory;
import Products.NYStyleCheesePizza;
import Products.NYStyleViggiePizza;
import Products.Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;
    IngredientFactory nyFactory = new NYFactory();
    @Override
    Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
            pizza.setName("NY Style Cheese Pizza");

        }else if(type.equals("veggie")){
            pizza = new NYStyleViggiePizza();
            pizza.setName("NY Style Veggie Pizza");
        }

        return pizza;
    }
}
