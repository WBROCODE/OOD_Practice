package Components;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponents{
    List<MenuComponents> children;
    String name;
    String description;

    public Menu(String name, String description){
        children = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponents child) {
        children.add(child);
    }

    @Override
    public void remove(MenuComponents child) {
        children.remove(child);
    }

    @Override
    public MenuComponents getChild(int i) {
        return children.get(i);
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
    public void print() {
        System.out.println( "Menu: " + this.name);
        System.out.println( "Menu Description: " + this.description);
        for(MenuComponents child : children){
            child.print();
        }
        System.out.println("--------------------------------");
    }
}
