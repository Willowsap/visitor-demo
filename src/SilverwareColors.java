import java.util.Arrays;

public class SilverwareColors extends DinnerTableVisitor {
	
	private int[][] colors = new int[RandomTable.SILVERWARES.length]
			[RandomTable.COLORS.length];
	
	public void reset() {
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < colors[i].length; j++) {
				colors[i][j] = 0;
			}
		}
	}
	
	public void report() {
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < colors[i].length; j++) {
				System.out.printf("%s %ss: %d\n",
						RandomTable.COLORS[j],
						RandomTable.SILVERWARES[i],
						colors[i][j]);
			}
		}
	}
	
	public void visit(Silverware s) {
		colors[Arrays.asList(RandomTable.SILVERWARES).indexOf(s.type)]
				[Arrays.asList(RandomTable.COLORS).indexOf(s.getColor())]++;
	}
}
