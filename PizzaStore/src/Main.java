import Creator.CAPizzaStore;
import Creator.NYPizzaStore;
import Creator.PizzaStore;
import Products.Pizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PizzaStore store = new NYPizzaStore();
    Pizza pizzaOne = store.createOrder("cheese");
    System.out.println("Order: " + pizzaOne.getName());

    System.out.println("---------------------------------");
    Pizza pizzaTwo = store.createOrder("veggie");
    System.out.println("Order: " + pizzaTwo.getName());

    System.out.println("---------------------------------");
    PizzaStore storeTwo = new CAPizzaStore();
    Pizza pizzaThree = storeTwo.createOrder("veggie");
    System.out.println("Order: " + pizzaThree.getName());

    System.out.println("---------------------------------");
    Pizza pizzaFour = storeTwo.createOrder("cheese");
    System.out.println("Order: " + pizzaFour.getName());
}
