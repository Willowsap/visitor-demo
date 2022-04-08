public class LiquidCountVisitor extends DinnerTableVisitor {

    private double coffeeAmount;
    private double juiceAmount;

    public LiquidCountVisitor() {
        this.coffeeAmount = 0;
        this.juiceAmount = 0;
    }

    public double getLiquidAmount() {
        return this.juiceAmount + coffeeAmount;
    }

    public double getCoffeeAmount() {
        return this.coffeeAmount;
    }

    public double getJuiceAmount() {
        return this.juiceAmount;
    }

    public void resetLiquidAmount() {
        this.coffeeAmount = 0;
        this.juiceAmount = 0;
    }

    public void report() {
        System.out.println("Liquid Contents:");
        System.out.printf("Total Juice: %.2f units\n", getJuiceAmount());
        System.out.printf("Total Coffee: %.2f units\n", getCoffeeAmount());
        System.out.printf("Total Liquid: %.2f units\n", getLiquidAmount());
    }

    @Override
    public void visit(CoffeeCup cup) {
        this.coffeeAmount += cup.getCoffeeAmount();
    }

    @Override
    public void visit(JuiceGlass glass) {
        this.juiceAmount += glass.getJuiceAmount();
    }
}
