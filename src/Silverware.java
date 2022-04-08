public class Silverware extends Item {
    public Silverware(String type, double height, double weight, String color) {
        super("Silverware: " + type, height, weight, color);
    }

    @Override
    public void accept(DinnerTableVisitor visitor) {
        visitor.visit(this);
    }
}
