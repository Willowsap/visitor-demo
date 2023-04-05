package table;
import java.util.Random;

import table.items.CoffeeCup;
import table.items.Item.Color;
import table.items.Item;
import table.items.JuiceGlass;
import table.items.Plate;
import table.items.Silverware;
import table.items.Silverware.SilverwareType;

/**
 * Creates a Table structure with random items on it.
 * 
 * @author Willow
 * @version 04/05/2023
 */
public class RandomTable
{
    /**
     * Constructs and returns a table with random items.
     * 
     * @return the filled table.
     */
    public static Table getRandomTable()
    {
        Color[] colors = Color.values();
        SilverwareType[] silverwares = SilverwareType.values();
        Table table = new Table();
        Random rand = new Random();
        int numItems = rand.nextInt(100) + 20;
        int randItemNum;
        for (int i = 0; i < numItems; i++) {
            Item randItem = null;
            randItemNum = rand.nextInt(4);
            switch (randItemNum) {
                case 0:
                    randItem = new CoffeeCup(rand.nextInt(3) + 2, rand.nextInt(10) + 4,
                        colors[rand.nextInt(colors.length)], rand.nextDouble() * 10, 0);
                    break;
                case 1:
                    randItem = new JuiceGlass(rand.nextInt(3) + 2, rand.nextInt(10) + 4,
                        colors[rand.nextInt(colors.length)], rand.nextDouble() * 10);
                    break;
                case 2:
                    randItem = new Plate(rand.nextInt(2) + 1, rand.nextInt(14) + 4,
                        colors[rand.nextInt(colors.length)]);
                    break;
                case 3:
                    randItem = new Silverware(silverwares[rand.nextInt(silverwares.length)],
                        rand.nextInt(2) + 1, rand.nextInt(14) + 4,
                        colors[rand.nextInt(colors.length)]);
                    break;
            }
            table.putItemOnTable(randItem);
        }
        return table;
    }
}
