package arenagame.character;

public class Values {

    private int health = 1;

    private int mana = 1;

    private int stamina = 1;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Values{" +
                "health=" + health +
                ", mana=" + mana +
                ", stamina=" + stamina +
                '}';
    }
}
