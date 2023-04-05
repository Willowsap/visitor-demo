package table.visitors;

import table.items.CoffeeCup;
import table.items.Item;
import table.items.JuiceGlass;
import table.items.Plate;
import table.items.Silverware;

/**
 * Calculates the height / weight ratio of all items on the table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class HeightWeightRatioVisitor extends TableVisitor
{
	/**
	 * The total height of all items seen.
	 */
	private double totalHeight;

	/**
	 * The total weight of all items seen.
	 */
	private double totalWeight;

	/**
	 * The total number of items seen.
	 */
	private int totalItems;

	/**
	 * All visitors increment height, weight, and total count.
	 */
    public void visit(CoffeeCup item) {getData(item);}
    public void visit(JuiceGlass item) {getData(item);}
    public void visit(Plate item) {getData(item);}
    public void visit(Silverware item) {getData(item);}

	/**
	 * Reports the height / weight ratio and averages.
	 */
    public void report()
	{
    	double avgHeight = totalHeight / totalItems;
    	double avgWeight = totalWeight / totalItems;
    	System.out.printf("Avg Height: %.2f\n", avgHeight);
    	System.out.printf("Avg Weight: %.2f\n", avgWeight);
    	System.out.printf("Height/Weight: %.2f\n", avgHeight / avgWeight);
    }

	/**
	 * Increments all fields for the given item.
	 * 
	 * @param item the item from which to get height and weight
	 */
    private void getData(Item item)
	{
    	this.totalHeight += item.getHeight();
    	this.totalWeight += item.getWeight();
    	this.totalItems++;
    }
}
