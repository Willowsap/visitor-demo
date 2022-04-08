public class DinnerTableTraverser {
    public void traverse(DinnerTable table, DinnerTableVisitor visitor) {
        table.goToBeginningOfShelf();
        while (table.hasMoreItems()) {
            table.nextItem().accept(visitor);
        }
    }
}
