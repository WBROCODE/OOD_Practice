import Components.Menu;
import Components.MenuComponents;
import Components.MenuItem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    MenuComponents breakfastComponent = new Menu("Breakfast", "Breakfast menu");
    MenuComponents lunchComponent = new Menu("Lunch", "Lunch menu");

    MenuComponents allMenu = new Menu("All Menu", "All menu");
    allMenu.add(breakfastComponent);
    allMenu.add(lunchComponent);

    // breakfast
    MenuComponents bread = new Menu("Bread", "Bread menu");
    bread.add(new MenuItem("Bread A", "Great Bread A", 2.00, true));
    bread.add(new MenuItem("Bread B", "Great Bread B", 3.00, true));
    breakfastComponent.add(bread);

    // lunch
    MenuComponents drinkComponent = new Menu("Drink", "Drink menu");
    drinkComponent.add(new MenuItem("Shake", "Good Shake", 1.00, true));
    MenuComponents foodComponent = new Menu("Food", "Food menu");
    foodComponent.add(new MenuItem("Pizza", "Good Pizza", 5.00, true));
    foodComponent.add(new MenuItem("Burger", "Good Burger", 3.00, true));
    lunchComponent.add(drinkComponent);
    lunchComponent.add(foodComponent);


    breakfastComponent.print();

}
