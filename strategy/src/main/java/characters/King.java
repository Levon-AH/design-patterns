package characters;

public class King extends Character {
    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
