package characters;

import behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(final WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
