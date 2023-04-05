package table.visitors;

import table.items.CoffeeCup;
import table.items.JuiceGlass;

/**
 * Calculates the total amount of liquid on the table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class LiquidCountVisitor extends TableVisitor
{
    /**
     * The total amount of coffee seen.
     */
    private double coffeeAmount;

    /**
     * The total amount of juice seen.
     */
    private double juiceAmount;

    /**
     * Getter for the overall amount of liquid seen.
     * 
     * @return the total amount of liquid seen
     */
    public double getLiquidAmount()
    {
        return this.juiceAmount + coffeeAmount;
    }

    /**
     * Getter for the total amount of coffee seen.
     * 
     * @return the total amount of coffee seen
     */
    public double getCoffeeAmount()
    {
        return this.coffeeAmount;
    }

    /**
     * Getter for the total amount of juice seen.
     * 
     * @return the total amount of juice seen
     */
    public double getJuiceAmount()
    {
        return this.juiceAmount;
    }

    /**
     * Reports on the liquid amounts on the table.
     */
    public void report()
    {
        System.out.println("Liquid Contents:");
        System.out.printf("Total Juice: %.2f units\n", getJuiceAmount());
        System.out.printf("Total Coffee: %.2f units\n", getCoffeeAmount());
        System.out.printf("Total Liquid: %.2f units\n", getLiquidAmount());
    }

    /**
     * Increments the corresponding liquid type by the amount seen.
     */
    public void visit(CoffeeCup cup) {coffeeAmount += cup.getCoffeeAmount();}
    public void visit(JuiceGlass glass) {juiceAmount += glass.getJuiceAmount();}
}
