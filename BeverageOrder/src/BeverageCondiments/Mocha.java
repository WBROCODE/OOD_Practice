package BeverageCondiments;

import Size.Size;
import Beverage.*;

public class Mocha extends BeverageCondiments{
   
    public Mocha(Beverage b){
        super(b);
    }

    public String getDescription(){
        return beverage.getDescription() + " Mocha";
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
