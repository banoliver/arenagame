package arenagame.items;

import arenagame.Item;

public abstract class UsableItem extends Item {

    public UsableItem(int ID, String name, int price, int weight, int condition) {
        super(ID, name, price, weight, condition);
    }
}
