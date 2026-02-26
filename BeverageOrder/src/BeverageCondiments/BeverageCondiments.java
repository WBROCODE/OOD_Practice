package BeverageCondiments;

import Beverage.Beverage;
import Size.Size;

public abstract class BeverageCondiments extends Beverage{
    Beverage beverage;
    
    protected BeverageCondiments(Beverage beverage){
        this.beverage = beverage;
    }


    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
