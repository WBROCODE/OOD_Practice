package Character;

import WeaponBehavior.ArrowBowBehavior;

public class Queen extends Character{
    
    public Queen(){
        wp = new ArrowBowBehavior(); 
    }
    @Override
    public void fight(){
        System.out.println("I am using " + wp.getterW());
        wp.useWeapon();
    }
}
