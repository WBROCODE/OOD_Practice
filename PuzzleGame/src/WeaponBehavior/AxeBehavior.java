package WeaponBehavior;

public class AxeBehavior implements WeaponBehavior{
    String weapon = "Axe";
    public void useWeapon(){
        System.out.println("Chopping");
    }

    public String getterW(){
        return weapon;
    }

}
