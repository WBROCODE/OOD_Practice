import Animals.*;
import Behavior.Fly.FlyRocketPowered;
import Behavior.Quark.MuteQuark;

public class App {
    public static void main(String[] args) throws Exception {
        // Q1
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuark();
        mallard.display();
        // Q2
        System.out.println("------------------------------");
        Duck donald = new DonaldDuck();
        donald.performFly();
        donald.setFlyBehavior(new FlyRocketPowered());
        donald.performFly();
        System.out.println("------------------------------");
        donald.performQuark();
        donald.setQuarkBehavior(new MuteQuark());
        donald.performQuark();
    }
}
