package table.visitors;

import table.items.Item.Color;
import table.items.Silverware;
import table.items.Silverware.SilverwareType;

/**
 * Calculates the number of each color of each type of silverware.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023 
 */
public class SilverwareColors extends TableVisitor {
	
	/**
	 * Stores the number of each color seen for each type of silverware.
	 */
	private int[][] colors;

	/**
	 * Creates a new silverware colors visitor.
	 * Initializes the 2d colors array.
	 */
	public SilverwareColors()
	{
		colors = new int[SilverwareType.values().length][Color.values().length];
	}
	
	/**
	 * Reports the number of each color of each type of silverare seen.
	 */
	public void report() {
		Color[] allColors = Color.values();
		SilverwareType[] allTypes = SilverwareType.values();
		for (int i = 0; i < colors.length; i++)
		{
			for (int j = 0; j < colors[i].length; j++)
			{
				System.out.printf("%s %ss: %d\n",
					allColors[j], allTypes[i], colors[i][j]);
			}
		}
	}
	
	/**
	 * Only needs to visit silverware.
	 * Increments the count based on type and color.
	 * 
	 * @param s the silverware seen
	 */
	public void visit(Silverware s)
	{
		colors[s.getType().ordinal()][s.getColor().ordinal()]++;
	}
}
