package Character;

import WeaponBehavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior wp;
    
    public Character(){}

    public void fight(){}

    public void setWeaponBehavior(WeaponBehavior wp){
        this.wp = wp;
    }

}
