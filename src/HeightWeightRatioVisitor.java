
public class HeightWeightRatioVisitor extends DinnerTableVisitor {
	double totalHeight;
	double totalWeight;
	int totalItems;
	public HeightWeightRatioVisitor() {
		reset();
	}
	public void reset() {
		this.totalHeight = 0;
		this.totalWeight = 0;
		this.totalItems = 0;
	}
    public void visit(CoffeeCup item) {
    	getData(item);
    }
    public void visit(JuiceGlass item) {
    	getData(item);
    }
    public void visit(Plate item) {
    	getData(item);
    }
    public void visit(Silverware item) {
    	getData(item);
    }
    public void report() {
    	double avgHeight = totalHeight / totalItems;
    	double avgWeight = totalWeight / totalItems;
    	System.out.printf("Avg Height: %.2f\n", avgHeight);
    	System.out.printf("Avg Weight: %.2f\n", avgWeight);
    	System.out.printf("Height/Weight: %.2f\n", avgHeight / avgWeight);
    }
    private void getData(Item item) {
    	this.totalHeight += item.getHeight();
    	this.totalWeight += item.getWeight();
    	this.totalItems++;
    }
}
