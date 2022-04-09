import java.util.Random;

public class RandomTable {

    public static final String[] COLORS = {"white", "black", "blue", "red", "green", "purple"};
    public static final String[] SILVERWARES = {"fork", "knife", "spoon"};

    public static DinnerTable getRandomTable() {
        DinnerTable table = new DinnerTable();
        Random rand = new Random();
        int numItems = rand.nextInt(100) + 20;
        int randItemNum;
        for (int i = 0; i < numItems; i++) {
            Item randItem = null;
            randItemNum = rand.nextInt(4);
            switch (randItemNum) {
                case 0:
                    randItem = new CoffeeCup(rand.nextInt(3) + 2, rand.nextInt(10) + 4,
                        COLORS[rand.nextInt(COLORS.length)], rand.nextDouble() * 10);
                    break;
                case 1:
                    randItem = new JuiceGlass(rand.nextInt(3) + 2, rand.nextInt(10) + 4,
                        COLORS[rand.nextInt(COLORS.length)], rand.nextDouble() * 10);
                    break;
                case 2:
                    randItem = new Plate(rand.nextInt(2) + 1, rand.nextInt(14) + 4,
                        COLORS[rand.nextInt(COLORS.length)]);
                    break;
                case 3:
                    randItem = new Silverware(SILVERWARES[rand.nextInt(SILVERWARES.length)],
                        rand.nextInt(2) + 1, rand.nextInt(14) + 4,
                        COLORS[rand.nextInt(COLORS.length)]);
                    break;
            }
            table.putItemOnShelf(randItem);
        }
        return table;
    }
}
