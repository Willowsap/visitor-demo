package table.items;

import table.visitors.TableVisitor;

/**
 * A juice glass that can be placed on a table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class JuiceGlass extends Item
{
    /**
     * The amount of juice in the glass
     */
    double juiceAmount;

    /**
     * Constructs a new juice glass.
     * 
     * @param height the height of the glass
     * @param weight the weight of the glass
     * @param color the color of the glass
     * @param juiceAmount the amount of juice in the glass
     */
    public JuiceGlass(double height, double weight,
        Color color, double juiceAmount)
    {
        super("JuiceGlass", height, weight, color);
        this.juiceAmount = juiceAmount;
    }

    /**
     * Getter for the amount of juice in the glass.
     * 
     * @return the amount of guice in the glass
     */
    public double getJuiceAmount()
    {
        return this.juiceAmount;
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
