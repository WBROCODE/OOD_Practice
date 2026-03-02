package Iterator;

import Food.MenuItem;

import java.util.List;

public class FoodIterator implements Iterator<MenuItem> {
    private final List<MenuItem> menuItems;
    private int position = 0;

    public FoodIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove is not supported");
    }
}