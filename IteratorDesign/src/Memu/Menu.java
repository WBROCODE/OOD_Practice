package Memu;

import Food.MenuItem;
import Iterator.Iterator;

public interface Menu {
    void addItem(String name, String description, double price, boolean isVegetarian);
    Iterator<MenuItem> createIterator();
}