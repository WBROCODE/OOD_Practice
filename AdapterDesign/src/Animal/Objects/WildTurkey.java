package Animal.Objects;

import Animal.Interface.Turkey;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println( "Gobble gobble");
    }
    public void fly() {
        System.out.println( "Wild Turkey is flying");
    }
}
