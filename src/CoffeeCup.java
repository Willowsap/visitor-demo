public class CoffeeCup extends Item {

    private double coffeeAmount;

    public CoffeeCup(double height, double weight, String color, double coffeeAmount) {
        super("Coffee Cup", height, weight, color);
        this.coffeeAmount = coffeeAmount;
    }

    public double getCoffeeAmount() {
        return this.coffeeAmount;
    }

    public void accept(DinnerTableVisitor visitor) {
        visitor.visit(this);
    }
}
