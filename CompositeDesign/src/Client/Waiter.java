package Client;

import Components.MenuComponents;

import java.util.List;

public class Waiter {

    MenuComponents menuComponents;

    public Waiter(MenuComponents menuComponents){
        this.menuComponents = menuComponents;
    }

    public void printMenu(){
        menuComponents.print();
    }
}
