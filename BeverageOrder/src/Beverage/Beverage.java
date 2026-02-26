package Beverage;

import Size.Size;

public abstract class Beverage {
    String discription = "unknown";
    Size size;
    public String getDescription(){
        return discription;
    }
    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }
    public abstract double cost();
}
