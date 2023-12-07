package pr23;

import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager {
    private Map<Integer, Order> ordersMap = new HashMap<>();

    public void addOrder(int tableNumber, Order order) {
        ordersMap.put(tableNumber, order);
    }

    public double getTableTotalCost(int tableNumber) {
        Order order = ordersMap.get(tableNumber);
        if (order == null) {
            throw new IllegalArgumentException("Order for table " + tableNumber + " not found");
        }

        return order.getTotalCost();
    }
}
