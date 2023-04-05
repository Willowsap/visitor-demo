package table.items;

import table.visitors.TableVisitor;

/**
 * A coffee cup that can be placed on a table.
 * 
 * @author Willow Sapphire
 */
public class CoffeeCup extends Item
{
    /**
     * The volume of the cup.
     */
    private double volume;

    /**
     * The amount of coffee in the cup.
     * Can never be below zero or above volume.
     */
    private double coffeeAmount;

    /**
     * Constructs a new coffee cup
     * @param height the height of the cup
     * @param weight the weight of the cup
     * @param color the color of the cup
     * @param volume the volume of the cup
     * @param coffeeAmount the amount of coffee in the cup
     */
    public CoffeeCup(double height, double weight, Color color,
        double volume, double coffeeAmount)
    {
        super("Coffee Cup", height, weight, color);
        this.volume = volume;
        this.coffeeAmount = coffeeAmount;
    }

    /**
     * Drinks some coffee.
     * 
     * @param amount the amount of coffee to drink
     * @return true if coffee was drunk
     */
    public boolean drink(double amount)
    {
        if (amount > this.getCoffeeAmount())
        {
            System.out.println("There is not enough coffee. "
                + "You drink the rest");
            return false;
        }
        else if (amount < 0)
        {
            System.out.println("You cannot drink a negative amount of coffee");
            return false;
        }
        else
        {
            this.coffeeAmount -= amount;
            return true;
        }
    }

    /**
     * Refills the coffee cup to its max volume.
     */
    public void refill()
    {
        this.coffeeAmount = this.volume;
    }

    /**
     * Getter for the volume of the cup.
     * 
     * @return the volume of the cup
     */
    public double getVolume()
    {
        return this.coffeeAmount;
    }

    /**
     * Getter for the amount of coffe in the cup.
     * 
     * @return the amount of coffee in the cup
     */
    public double getCoffeeAmount()
    {
        return this.coffeeAmount;
    }

    /**
     * Accepts a visitor.
     * 
     * @param visitor the visitor to accept
     */
    @Override
    public void accept(TableVisitor visitor)
    {
        visitor.visit(this);
    }
}
