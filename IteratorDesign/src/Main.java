import Memu.BreakfastMenu;
import Memu.DinnerMenu;
import Waiter.Waiter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BreakfastMenu breakfastMenu = new BreakfastMenu();
    DinnerMenu dinnerMenu = new DinnerMenu();

    Waiter waiter = new Waiter(breakfastMenu, dinnerMenu);
    waiter.printMenu();
}
