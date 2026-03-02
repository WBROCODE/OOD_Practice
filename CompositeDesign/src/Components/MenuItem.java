package Components;

public class MenuItem extends MenuComponents{
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian){
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        System.out.print("Name: " + this.name + " Description: " + this.description + " Price: " + this.price + " ");
        if(this.vegetarian){
            System.out.println("Vegetarian");
        }

    }
}
