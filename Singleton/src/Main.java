import ChocolateBoiler.ChocolateBoiler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
    chocolateBoiler.fill();
    chocolateBoiler.boil();
    chocolateBoiler.drain();

    // ChocolateBoiler ch = new ChocolateBoiler();

    // System.out.println(chocolateBoiler.equals(ch));
    ChocolateBoiler a = ChocolateBoiler.getInstance();
    ChocolateBoiler b = ChocolateBoiler.getInstance();
    System.out.println(a == b);
}
