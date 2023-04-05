import table.Table;
import table.TableTraverser;
import table.RandomTable;
import table.visitors.TableVisitor;
import table.visitors.SilverwareColors;

/**
 * Demo to play with the Table and Table Visitors.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class Demo
{
    /**
     * Runs the demo
     * 
     * @param args unused
     */
    public static void main(String[] args)
    {
        Table table = RandomTable.getRandomTable();
        TableTraverser traverser = new TableTraverser();
        TableVisitor visitor = new SilverwareColors();
        traverser.traverse(table, visitor);
        System.out.println(table);
        visitor.report();
    }
}
