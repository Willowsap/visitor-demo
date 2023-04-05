package table.visitors;

import table.items.CoffeeCup;
import table.items.Item;
import table.items.JuiceGlass;
import table.items.Plate;
import table.items.Silverware;
import table.items.Item.Color;

/**
 * Counts the occurances of each color on a table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class ColorCountVisitor extends TableVisitor
{
	/**
	 * Stores the counts for each color.
	 * Indices match up with enum indices.
	 */
	private int[] colorCounts;

	/**
	 * Creates a new color count visitor.
	 */
	public ColorCountVisitor()
	{
		colorCounts = new int[Color.values().length];
	}

	/**
	 * Reports the count of each color.
	 */
	public void report() 
	{
		Color[] colors = Color.values();
		System.out.println("Color counts:");
		for (int i = 0; i < colors.length; i++)
		{
			System.out.printf("%s: %d\n", colors[i], colorCounts[i]);
		}
	}

	/**
	 * Each visit method increments the color count for the 
	 * color of that item.
	 */
	public void visit(CoffeeCup item){incCount(item);}
    public void visit(JuiceGlass item){incCount(item);}
    public void visit(Plate item){incCount(item);}
    public void visit(Silverware item){incCount(item);}
	private void incCount(Item i){colorCounts[i.getColor().ordinal()]++;}
}
