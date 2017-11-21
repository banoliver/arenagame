package arenagame;

public abstract class Item {

    private int ID;

    private String name;

    private int price;

    private int weight;

    private int condition;

    public Item(int ID, String name, int price, int weight, int condition) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.condition = condition;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", condition=" + condition +
                '}';
    }
}
