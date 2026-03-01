package Animal.Adaptor;

import Animal.Interface.Duck;
import Animal.Interface.Turkey;

public class DuckAdaptor implements Turkey {
    Duck duck;

    public DuckAdaptor(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }
    public void fly() {
        duck.fly();
    }
}
