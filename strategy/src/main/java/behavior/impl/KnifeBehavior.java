package behavior.impl;

import behavior.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using KNIFE as weapon!!!!");
    }
}
