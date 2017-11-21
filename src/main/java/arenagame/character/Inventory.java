package arenagame.character;

import arenagame.Item;
import arenagame.items.UsableItem;

import java.util.List;

public class Inventory {

    private Body body;

    private List<Item> bag;

    private List<UsableItem> quickSlot;

    @Override
    public String toString() {
        return "Inventory{" +
                "body=" + body +
                ", bag=" + bag +
                ", quickSlot=" + quickSlot +
                '}';
    }
}
