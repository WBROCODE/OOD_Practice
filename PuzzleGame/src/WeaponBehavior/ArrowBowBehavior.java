package WeaponBehavior;

public class ArrowBowBehavior implements WeaponBehavior{
    String weapon = "Arrow And Bow";
    public void useWeapon(){
        System.out.println("Shooting");
    }

    public String getterW(){
        return weapon;
    }
}
