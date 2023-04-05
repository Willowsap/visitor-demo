package table.items;

import table.visitors.TableVisitor;

/**
 * A plate that can be placed on a table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class Plate extends Item
{
    /**
     * Constructs a new plate object.
     * 
     * @param height the height of the plate
     * @param weight the weight of the plate
     * @param color the color of the plate
     */
    public Plate(double height, double weight, Color color)
    {
        super("Plate", height, weight, color);
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
