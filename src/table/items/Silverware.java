package table.items;

import table.visitors.TableVisitor;

/**
 * Silverware that can be placed on a table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class Silverware extends Item
{
    public enum SilverwareType {
        KNIFE,
        FORK,
        SPOON
    }
    /**
     * The type of silverware
     */
	private SilverwareType type;

    /**
     * Constructs a new piece of silverware
     * @param type the type of silverware
     * @param height the height of the silverware
     * @param weight the weight of the silverware
     * @param color the color of the silverware
     */
    public Silverware(SilverwareType type, double height,
        double weight, Color color)
    {
        super("Silverware: " + type, height, weight, color);
        this.type = type;
    }

    /**
     * Getter for the type of silverware.
     * 
     * @return the type
     */
    public SilverwareType getType() 
    {
        return this.type;
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
