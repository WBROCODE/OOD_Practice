package Products;

public class CAStyleViggiePizza extends Pizza{
    public CAStyleViggiePizza(){
        name = "CA Style Viggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Roasted Red Pepper");
    }
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
