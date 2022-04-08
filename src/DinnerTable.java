import java.util.ArrayList;

public class DinnerTable {
    ArrayList<Item> items;
    int index;

    public DinnerTable() {
        items = new ArrayList<Item>();
        index = -1;
    }

    public void putItemOnShelf(Item item) {
        this.items.add(item);
    }

    public Item nextItem() {
        if (!hasMoreItems()) {
            return null;
        }
        return items.get(index++);
    }

    public void goToBeginningOfShelf() {
        this.index = 0;
    }

    public boolean hasMoreItems() {
        return index >=0 && index < items.size();
    }

    public String toString() {
        String s = "";
        for (Item i : items) {
            s += i.getName() + "\n";
        }
        return s;
    }
}
