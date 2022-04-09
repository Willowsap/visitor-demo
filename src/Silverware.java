public class Silverware extends Item {
	
	String type;
	
    public Silverware(String type, double height, double weight, String color) {
        super("Silverware: " + type, height, weight, color);
        this.type = type;
    }

    @Override
    public void accept(DinnerTableVisitor visitor) {
        visitor.visit(this);
    }
}
