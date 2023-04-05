package table;

import table.items.Item;
import table.visitors.TableVisitor;

/**
 * Traverser that walks through a table.
 * Carres a visitor to every item on the table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class TableTraverser
{
    /**
     * Traverses the entire table, bringing the visitor to each item.
     * 
     * @param table the table to traverse
     * @param visitor the visitor to carry
     */
    public void traverse(Table table, TableVisitor visitor)
    {
        table.goToBeginningOfTable();
        while (table.hasMoreItems())
        {
            Item item = table.nextItem();
            item.accept(visitor);
        }
    }
}
