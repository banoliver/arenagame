package arenagame;

import arenagame.character.*;

public class Main {

<<<<<<< .merge_file_a08632
=======
    public static void main(String[] args) {

        int ID = 1;

        String name = "Ork Józsi";

        Race race = Race.ORC;

        ClassType classType = ClassType.WARRIOR;

        Attributes attributes = new Attributes();

        Values values = new Values();

        Inventory inventory = new Inventory();

        Character character = new Character(ID, name, race, classType, attributes, values, inventory);

        System.out.println(character);
    }
>>>>>>> .merge_file_a01416
}
