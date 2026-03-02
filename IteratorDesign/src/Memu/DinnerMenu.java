package Memu;

import Food.MenuItem;
import Iterator.FoodIterator;
import Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu {

    private final List<MenuItem> menuItems;

    public DinnerMenu() {
        menuItems = new ArrayList<>();
        addItem("Burger", "Delicious Burger", 12.0, false);
        addItem("Pizza", "Delicious Pizza", 15.0, false);
    }

    @Override
    public void addItem(String name, String description, double price, boolean isVegetarian) {
        this.menuItems.add(new MenuItem(name, description, price, isVegetarian));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new FoodIterator(menuItems);
    }
}