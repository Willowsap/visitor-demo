public class Plate extends Item {
    public Plate(double height, double weight, String color) {
        super("Plate", height, weight, color);
    }

    @Override
    public void accept(DinnerTableVisitor visitor) {
        visitor.visit(this);
    }
}
