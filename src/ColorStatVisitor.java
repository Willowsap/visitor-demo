import java.util.Arrays;

public class ColorStatVisitor extends DinnerTableVisitor {
	private int[] colorWeights = new int[RandomTable.COLORS.length];
	private int[] colorHeights = new int[RandomTable.COLORS.length];
	public ColorStatVisitor() {
		reset();
	}
	public void reset() {
		for (int i = 0; i < colorHeights.length; i++) {
			colorHeights[i] = 0;
			colorWeights[i] = 0;
		}
	}
	public void report() {
		Arrays.sort(colorHeights);
		Arrays.sort(colorWeights);
		for (int i = 0; i < colorHeights.length; i++) {
			System.out.printf("Total height of %s items: %d\n",
					RandomTable.COLORS[i], colorHeights[i]);
		}
		System.out.println();
		for (int i = 0; i < colorWeights.length; i++) {
			System.out.printf("Total weight of %s items: %d\n",
					RandomTable.COLORS[i], colorWeights[i]);
		}
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
    
    private void getData(Item item) {
    	colorHeights[Arrays.asList(RandomTable.COLORS)
    	             .indexOf(item.getColor())] += item.getHeight();
    	colorWeights[Arrays.asList(RandomTable.COLORS)
    	             .indexOf(item.getColor())] += item.getWeight();
    }
}
