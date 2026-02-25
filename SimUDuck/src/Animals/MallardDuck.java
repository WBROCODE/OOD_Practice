package Animals;

import Behavior.Quark.*;
import Behavior.Fly.*;


public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviors = new FlyWithWings();
        quarkBehaviors = new Quark();
    }

    @Override
    public void display(){
        System.out.println("I'm a Mallard duck");
    }
}
