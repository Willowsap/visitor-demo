public class JuiceGlass extends Item {

    double juiceAmount;

    public JuiceGlass(double height, double weight, String color, double juiceAmount) {
        super("JuiceGlass", height, weight, color);
        this.juiceAmount = juiceAmount;
    }

    public double getJuiceAmount() {
        return this.juiceAmount;
    }

    public void accept(DinnerTableVisitor visitor) {
        visitor.visit(this);
    }
}
