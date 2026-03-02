import Drinks.Coffee;
import Drinks.Tea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Tea tea = new Tea();
//    tea.prepareRecipe();
//    System.out.println("------------------------");
//    Coffee coffee = new Coffee();
//    coffee.prepareRecipe();
//    System.out.println("------------------------");

    Duck duck = new Duck("Donald", 10);
    Duck duck2 = new Duck("Jerry", 9);
    Duck duck3 = new Duck("Alex", 8);

    Duck[] ducks = {duck, duck2, duck3};

    System.out.println("Before sorting: ");
    printArray(ducks);
    System.out.println("------------------------");
    System.out.println("After sorting: ");
    Arrays.sort(ducks);
    printArray(ducks);


}

public static void printArray(Duck[] ducks) {
    for(Duck d : ducks) {
        System.out.println(d);
    }
}
