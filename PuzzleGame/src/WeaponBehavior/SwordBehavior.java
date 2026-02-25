package WeaponBehavior;

public class SwordBehavior implements WeaponBehavior{
    String weapon = "Sword";
    public void useWeapon(){
        System.out.println("Swing");
    }

    public String getterW(){
        return weapon;
    }
}
