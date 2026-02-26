package BeverageCondiments;
import Beverage.Beverage;
import Size.Size;

public class Soy extends BeverageCondiments{
    public Soy(Beverage b){
        super(b);
    }

    public String getDescription(){
        return beverage.getDescription() + " Soy";
    }

    public double cost(){
        double cost = beverage.cost();

        if(beverage.getSize() == Size.Tall){
            cost += 0.1;
        }else if(beverage.getSize() == Size.GRAND){
            cost += 0.15;
        }else if(beverage.getSize() == Size.VENTI){
            cost += 0.2;
        }


        return cost + 0.2;
    }
}