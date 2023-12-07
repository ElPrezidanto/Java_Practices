package pr23;

public class RestaurantOrderTest {
    public static void main(String[] args) {
        Item juice = new Drink(80.5, "Добрый", "сок бомба");
        Item pizza = new Dish(52.812, "Колбаски барбекю", "очень вкусная, с барбекю");
        Item salad = new Dish(22.22, "Салат Греческий", "все овози прямо с грядки");
        Order orderTable1 = new Order();
        orderTable1.addItem(juice);
        orderTable1.addItem(pizza);
        orderTable1.addItem(pizza);
        Order orderTable2 = new Order();
        orderTable2.addItem(salad);
        orderTable2.addItem(pizza);
        orderTable2.addItem(salad);
        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.addOrder(1, orderTable1);
        orderManager.addOrder(2, orderTable2);
        System.out.println("Столик 1 общая стоимость: $" + String.format("%.3f", orderManager.getTableTotalCost(1)));
        System.out.println("Столик 2 общая стоимость: $" + String.format("%.3f", orderManager.getTableTotalCost(2)));
    }
}
