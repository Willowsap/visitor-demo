package table.items;

import table.visitors.TableVisitor;

/**
 * A generic item that can be placed on a table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public abstract class Item
{
    /**
     * The name of the item.
     */
    protected String name;

    /**
     * The color of the item.
     */
    protected Color color;

    /**
     * The height of the item in cm.
     */
    protected double height;

    /**
     * The weight of the item grams.
     */
    protected double weight;

    /**
     * Creates a new item.
     * 
     * @param name the name for the item
     * @param height the height for the item
     * @param weight the weight for the item
     * @param color the color for the item
     */
    public Item(String name, double height, double weight, Color color)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    /**
     * Getter for the name of the item.
     * 
     * @return the name of the item
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Getter for the color of the item.
     * 
     * @return the color of the item.
     */
    public Color getColor()
    {
        return this.color;
    }

    /**
     * The getter for the height of the item.
     * 
     * @return the height of the item
     */
    public double getHeight()
    {
        return this.height;
    }

    /**
     * The getter for the weight of the item.
     * 
     * @return the weight of the item
     */
    public double getWeight()
    {
        return this.weight;
    }

    /**
     * Accepts a visitor.
     * 
     * @param visitor the visitor to accept
     */
    public abstract void accept(TableVisitor visitor);
}
