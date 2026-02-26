package Creator;

import Products.NYStyleCheesePizza;
import Products.NYStyleViggiePizza;
import Products.Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new NYStyleViggiePizza();
        }else return null;
    }
}
