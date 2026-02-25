package WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior{
    String weapon = "Knife";
    public void useWeapon(){
        System.out.println("Cutting");
    }

    public String getterW(){
        return weapon;
    }

}