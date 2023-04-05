package table.visitors;

import java.util.Arrays;
import table.items.CoffeeCup;
import table.items.Item.Color;
import table.items.Item;
import table.items.JuiceGlass;
import table.items.Plate;
import table.items.Silverware;

/**
 * Finds the total height and weight for all items of each color.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class ColorStatVisitor extends TableVisitor
{
	/**
	 * Stores the total weight seen for each color.
	 */
	private int[] colorWeights;

	/**
	 * Stores the total height seen for each color.
	 */
	private int[] colorHeights;

	/**
	 * Creates a new color stat visitor and initializes the arrays.
	 */
	public ColorStatVisitor()
	{
		colorHeights = new int[Color.values().length];
		colorWeights = new int[Color.values().length];
	}

	/**
	 * Reports on the height and weight totals of items of each color.
	 */
	public void report()
	{
		Color[] colors = Color.values();
		Arrays.sort(colorHeights);
		Arrays.sort(colorWeights);
		for (int i = 0; i < colorHeights.length; i++)
		{
			System.out.printf("Total height of %s items: %d\n",
					colors[i], colorHeights[i]);
		}
		System.out.println();
		for (int i = 0; i < colorWeights.length; i++)
		{
			System.out.printf("Total weight of %s items: %d\n",
					colors[i], colorWeights[i]);
		}
	}

	/**
	 * All visit methods use getData to add the height and weight
	 * to the appropriate color.
	 */
	public void visit(CoffeeCup item) {getData(item);}
    public void visit(JuiceGlass item) {getData(item);}
    public void visit(Plate item) {getData(item);}
    public void visit(Silverware item) {getData(item);}
    
	/**
	 * Increments the height and weight values for the given color.
	 * 
	 * @param item the item from which to get the color.
	 */
    private void getData(Item item)
	{
    	colorHeights[item.getColor().ordinal()] += item.getHeight();
    	colorWeights[item.getColor().ordinal()] += item.getWeight();
    }
}
