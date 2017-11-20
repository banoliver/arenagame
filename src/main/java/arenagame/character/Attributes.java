package arenagame.character;

public class Attributes {

    private int strength = 1;

    private int IQ = 1;

    private int dexterity = 1;

    private int quickness = 1;

    private int luck = 1;

    private int persistence = 1;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getQuickness() {
        return quickness;
    }

    public void setQuickness(int quickness) {
        this.quickness = quickness;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getPersistence() {
        return persistence;
    }

    public void setPersistence(int persistence) {
        this.persistence = persistence;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "strength=" + strength +
                ", IQ=" + IQ +
                ", dexterity=" + dexterity +
                ", quickness=" + quickness +
                ", luck=" + luck +
                ", persistence=" + persistence +
                '}';
    }
}
