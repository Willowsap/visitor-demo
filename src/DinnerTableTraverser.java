public class DinnerTableTraverser {
    public void traverse(DinnerTable table, DinnerTableVisitor visitor) {
        table.goToBeginningOfShelf();
        while (table.hasMoreItems()) {
            Item item = table.nextItem();
            item.accept(visitor);
        }
    }
}
