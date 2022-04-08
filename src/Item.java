public abstract class Item {
    protected String name;
    protected String color;
    protected double height;
    protected double weight;

    public Item(String name, double height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public abstract void accept(DinnerTableVisitor visitor);
}
