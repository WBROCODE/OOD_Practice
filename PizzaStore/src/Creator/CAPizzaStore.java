package Creator;

import Products.CAStyleCheesePizza;
import Products.Pizza;

public class CAPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        return new CAStyleCheesePizza();
    }
}
