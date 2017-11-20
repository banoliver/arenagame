package arenagame;

import arenagame.character.*;

public class Character {

    private int ID;

    private String name;

    private Race race;

    private ClassType classType;

    private Attributes attributes;

    private Values values;

    private Inventory inventory;

    private int distributablePoints;

    public Character(int ID, String name, Race race, ClassType classType, Attributes attributes, Values values, Inventory inventory) {
        this.ID = ID;
        this.name = name;
        this.race = race;
        this.classType = classType;
        this.attributes = attributes;
        this.values = values;
        this.inventory = inventory;
        this.distributablePoints = 30;
    }

    @Override
    public String toString() {
        return "Character{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", race=" + race +
                ", classType=" + classType +
                ", attributes=" + attributes +
                ", values=" + values +
                ", inventory=" + inventory +
                ", distributablePoints=" + distributablePoints +
                '}';
    }
}
