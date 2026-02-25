package Character;

import WeaponBehavior.SwordBehavior;


public class King extends Character{
    
    public King(){
        wp = new SwordBehavior(); 
    }
    @Override
    public void fight(){
        System.out.println("I am using " + wp.getterW());
        wp.useWeapon();
    }
}
