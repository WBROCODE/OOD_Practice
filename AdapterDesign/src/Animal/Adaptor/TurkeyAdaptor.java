package Animal.Adaptor;

import Animal.Interface.Duck;
import Animal.Interface.Turkey;

public class TurkeyAdaptor implements Duck {
    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        turkey.fly();
    }
}
