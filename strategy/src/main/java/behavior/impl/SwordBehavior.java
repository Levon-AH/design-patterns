package behavior.impl;

import behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using SWORD as weapon!!!!");
    }
}
