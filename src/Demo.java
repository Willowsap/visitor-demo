public class Demo {
    public static void main(String[] args) {
        DinnerTable table = RandomTable.getRandomTable();
        DinnerTableTraverser traverser = new DinnerTableTraverser();
        LiquidCountVisitor visitor = new LiquidCountVisitor();
        traverser.traverse(table, visitor);
        System.out.println(table);
        System.out.println(visitor.getLiquidAmount());
    }
}
