package Products;

public class NYStyleViggiePizza extends Pizza{
    public NYStyleViggiePizza(){
        name = "NY Style Viggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Parmesan Cheese");
    }
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
