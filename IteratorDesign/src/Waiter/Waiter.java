package Waiter;

import Food.MenuItem;
import Iterator.Iterator;
import Memu.Menu;

public class Waiter {
    private final Menu dinnerMenu;
    private final Menu breakfastMenu;

    public Waiter(Menu dinnerMenu, Menu breakfastMenu) {
        this.dinnerMenu = dinnerMenu;
        this.breakfastMenu = breakfastMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> breakfastMenuIterator = breakfastMenu.createIterator();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.createIterator();

        System.out.println("Breakfast Menu: ");
        printMenu(breakfastMenuIterator);

        System.out.println("-------------------------");

        System.out.println("Dinner Menu: ");
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> foodIterator) {
        while (foodIterator.hasNext()) {
            MenuItem item = foodIterator.next();
            System.out.println(item.getName() + " " + item.getPrice());
            System.out.println(item.getDescription());
        }
    }
}