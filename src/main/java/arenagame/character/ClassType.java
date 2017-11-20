package arenagame.character;

public enum ClassType {

    WARRIOR("Warrior"), MAGE("Mage"), RANGER("Ranger");

    private String value;

    ClassType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
