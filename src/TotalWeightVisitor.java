
public class TotalWeightVisitor extends DinnerTableVisitor {
	
	double totalWeight;
	
	public TotalWeightVisitor() {
		this.totalWeight = 0;
	}
	public void resetWeight() {
		this.totalWeight = 0;
	}
	public void report() {
		System.out.printf("Total weight on table: %.2f units\n", this.totalWeight);
	}
	public void visit(CoffeeCup item) {
		this.totalWeight += item.getWeight();
	}
    public void visit(JuiceGlass item) {
    	this.totalWeight += item.getWeight();
    }
    public void visit(Plate item) {
    	this.totalWeight += item.getWeight();
    }
    public void visit(Silverware item) {
    	this.totalWeight += item.getWeight();
    }
}
