package Memu;

import Food.MenuItem;
import Iterator.FoodIterator;
import Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BreakfastMenu implements Menu {
    private final List<MenuItem> menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList<>();
        addItem("Ramen", "Delicious Ramen", 10.0, true);
        addItem("Fried Chicken", "Delicious Fried Chicken", 18.0, false);
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