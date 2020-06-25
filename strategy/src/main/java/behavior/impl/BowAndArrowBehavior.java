package behavior.impl;

import behavior.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using BOW and ARROW as weapon!!!!");
    }
}
