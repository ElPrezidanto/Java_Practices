package pr24.num1;

public interface Order {
    boolean addItem(Item item);

    boolean removeItem(String itemName);

    int removeAllItems(String itemName);

    int getTotalItemCount();

    Item[] getItems();

    double getTotalCost();

    int getItemCount(String itemName);

    String[] getOrderedItemNames();

    Item[] getSortedItemsByCostDesc();
}
