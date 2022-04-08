public class LiquidCountVisitor extends DinnerTableVisitor {

    private double liquidAmount;

    public LiquidCountVisitor() {
        this.liquidAmount = 0;
    }

    public double getLiquidAmount() {
        return this.liquidAmount;
    }

    public void resetLiquidAmount() {
        this.liquidAmount = 0;
    }

    @Override
    public void visit(CoffeeCup cup) {
        this.liquidAmount += cup.getCoffeeAmount();
    }

    @Override
    public void visit(JuiceGlass glass) {
        this.liquidAmount += glass.getJuiceAmount();
    }

}
