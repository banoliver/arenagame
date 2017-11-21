package arenagame.items.wearables;

import arenagame.items.WearableItemSlot;

public abstract class HandheldItem {

    private WearableItemSlot wearableItemSlot = WearableItemSlot.HAND;

    private int defense;

    public HandheldItem(int defense) {
        this.defense = defense;
    }

    public WearableItemSlot getWearableItemSlot() {
        return wearableItemSlot;
    }

    public void setWearableItemSlot(WearableItemSlot wearableItemSlot) {
        this.wearableItemSlot = wearableItemSlot;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
