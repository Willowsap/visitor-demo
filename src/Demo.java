public class Demo {
    public static void main(String[] args) {
        DinnerTable table = RandomTable.getRandomTable();
        DinnerTableTraverser traverser = new DinnerTableTraverser();
        DinnerTableVisitor visitor = new SilverwareColors();
        traverser.traverse(table, visitor);
        System.out.println(table);
        visitor.report();
    }
}
