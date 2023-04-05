package table;
import java.util.ArrayList;

import table.items.Item;

/**
 * A Table Structure that is really just a wrapper for ArrayList.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class Table
{
    /**
     * The items on the table.
     */
    ArrayList<Item> items;

    /**
     * The current position on the table.
     */
    int index;

    /**
     * Creates a new, empty table.
     */
    public Table()
    {
        items = new ArrayList<Item>();
        index = -1;
    }

    /**
     * Adds an item to the table
     * 
     * @param item the item to put on the table
     */
    public void putItemOnTable(Item item)
    {
        this.items.add(item);
    }

    /**
     * Moves to the next item on the table.
     * Basically an iterator.
     * 
     * @return the next item.
     */
    public Item nextItem()
    {
        if (!hasMoreItems())
        {
            return null;
        }
        return items.get(index++);
    }

    /**
     * Sets the current location to the beginning of the table.
     */
    public void goToBeginningOfTable()
    {
        this.index = 0;
    }

    /**
     * Checks that the current location still has items.
     * 
     * @return true if there are items.
     */
    public boolean hasMoreItems()
    {
        return index >=0 && index < items.size();
    }

    /**
     * Returns a string of everything on the table.
     * 
     * @return a string representation of the table.
     */
    public String toString()
    {
        String s = "";
        for (Item i : items)
        {
            s += i.getName() + "\n";
        }
        return s;
    }
}
