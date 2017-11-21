package arenagame.items;

import arenagame.Item;

public abstract class WearableItem extends Item {

    private WearableItemSlot wearableItemSlot;

    public WearableItem(int ID, String name, int price, int weight, int condition, WearableItemSlot wearableItemSlot) {
        super(ID, name, price, weight, condition);
        this.wearableItemSlot = wearableItemSlot;
    }

    public WearableItemSlot getWearableItemSlot() {
        return wearableItemSlot;
    }

    public void setWearableItemSlot(WearableItemSlot wearableItemSlot) {
        this.wearableItemSlot = wearableItemSlot;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", condition=" + getCondition() +
                ", wearableItemSlot=" + getWearableItemSlot() +
                '}';
    }
}
