package table.visitors;

import table.items.CoffeeCup;
import table.items.JuiceGlass;
import table.items.Plate;
import table.items.Silverware;

/**
 * Calculates the total weight on the table.visitors
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class TotalWeightVisitor extends TableVisitor
{
	/** 
	 * The total weight of items seen.
	 */	
	private double totalWeight;
	
	/**
	 * Prints the total weight seen.
	 */
	public void report()
	{
		System.out.printf("Total weight on table: %.2f units\n", totalWeight);
	}

	/**
	 * Adds the weight to totalWeight for each item seen.
	 */
	public void visit(CoffeeCup item) {totalWeight += item.getWeight();}
    public void visit(JuiceGlass item) {totalWeight += item.getWeight();}
    public void visit(Plate item) {totalWeight += item.getWeight();}
    public void visit(Silverware item) {totalWeight += item.getWeight();}
}
