package arenagame.items.wearables.miscellaneous;

import arenagame.items.WearableItemSlot;
import arenagame.items.WearableItem;

public class Amulet extends WearableItem {

    public Amulet(int ID, String name, int price, int weight, int condition, WearableItemSlot wearableItemSlot) {
        super(104, "Amulet", 50, 1, 30, WearableItemSlot.MISCELLANEOUS);
    }
}
