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
    PizzaStore storeTwo = new CAPizzaStore();
    System.out.println("---------------------------------");
    Pizza pizzaThree = store.createOrder("veggie");
    System.out.println("Order: " + pizzaThree.getName());
    System.out.println("---------------------------------");
    Pizza pizzaFour = store.createOrder("cheese");
    System.out.println("Order: " + pizzaTwo.getName());
}
