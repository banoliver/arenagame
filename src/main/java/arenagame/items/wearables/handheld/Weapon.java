package arenagame.items.wearables.handheld;

import arenagame.items.wearables.HandheldItem;

public abstract class Weapon extends HandheldItem {

    private int attack;

    public Weapon(int defense, int attack) {
        super(defense);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
