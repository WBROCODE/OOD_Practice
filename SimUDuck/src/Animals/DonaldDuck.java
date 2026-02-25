package Animals;

import Behavior.Fly.FlyNoWings;
import Behavior.Quark.Quark;

public class DonaldDuck extends Duck{

    
    public DonaldDuck(){
        flyBehaviors = new FlyNoWings();
        quarkBehaviors = new Quark();
    }

    @Override
    public void display(){
        System.out.println("I'm a Donald duck");
    }
}
