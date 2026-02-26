package Creator;

import Products.Pizza;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza createOrder(String type){
        Pizza p = createPizza(type);
        // process
        p.prepare();
        p.bake();
        p.cut();
        p.box();

        return p;
    }
    // other method

}
