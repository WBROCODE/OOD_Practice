import Beverage.Beverage;
import Beverage.DarkRoast;
import BeverageCondiments.*;
import Size.Size;

public class Start {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------");
        Beverage one = new DarkRoast();
        one.setSize(Size.Tall);
        one = new Mocha(one);
        one = new Soy(one);

        System.out.println(one.cost());
        System.out.println(one.getDescription());
        System.out.println(one.getSize());


    }
}
