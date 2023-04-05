package table.visitors;

import table.items.CoffeeCup;
import table.items.JuiceGlass;
import table.items.Plate;
import table.items.Silverware;

/**
 * Abstract visitor for implementing algorithms on a table.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public abstract class TableVisitor
{
    public void visit(CoffeeCup item) {}
    public void visit(JuiceGlass item) {}
    public void visit(Plate item) {}
    public void visit(Silverware item) {}
    public void report() {}
}
