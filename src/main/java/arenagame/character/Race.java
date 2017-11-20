package arenagame.character;

public enum Race {

    HUMAN("Human"), ORC("Orc"), ELF("Elf");

    private final String value;

    Race(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
