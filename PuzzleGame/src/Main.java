import Character.King;
import Character.Queen;
import WeaponBehavior.AxeBehavior;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------");

        King king = new King();
        king.fight();
        System.out.println("------------------------------");
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
        System.out.println("------------------------------");
        Queen queen = new Queen();
        queen.fight();
        System.out.println("------------------------------");
        queen.setWeaponBehavior(new AxeBehavior());
        queen.fight();
    }
}
