import java.util.Arrays;

public class ColorCountVisitor extends DinnerTableVisitor {
	private int[] colors = new int[RandomTable.COLORS.length];
	public ColorCountVisitor() {
		for (int i = 0; i < colors.length; i++) {
			colors[i] = 0;
		}
	}
	public void report() {
		System.out.println("Color counts:");
		for (int i = 0; i < colors.length; i++) {
			System.out.printf("%s: %d\n", RandomTable.COLORS[i], colors[i]);
		}
	}
	public void visit(CoffeeCup item) {
		colors[Arrays.asList(RandomTable.COLORS).indexOf(item.getColor())]++;
	}
    public void visit(JuiceGlass item) {
    	colors[Arrays.asList(RandomTable.COLORS).indexOf(item.getColor())]++;
    }
    public void visit(Plate item) {
    	colors[Arrays.asList(RandomTable.COLORS).indexOf(item.getColor())]++;
    }
    public void visit(Silverware item) {
    	colors[Arrays.asList(RandomTable.COLORS).indexOf(item.getColor())]++;
    }
}
