package Animals;
import Behavior.Fly.FlyBehaviors;
import Behavior.Quark.QuarkBehaviors;

public abstract class Duck {
    FlyBehaviors flyBehaviors;
    QuarkBehaviors quarkBehaviors;
    
    // constructor
    public Duck(){}
    // methods
    public void display(){

    }

    public void swim(){
        System.out.println("I am swimming");
    }

    public void performFly(){
        flyBehaviors.fly();
    }

    public void performQuark(){
        quarkBehaviors.quark();
    }

    public void setFlyBehavior(FlyBehaviors fb){
        flyBehaviors = fb;
    }

    public void setQuarkBehavior(QuarkBehaviors qb){
        quarkBehaviors = qb;
    }

}
