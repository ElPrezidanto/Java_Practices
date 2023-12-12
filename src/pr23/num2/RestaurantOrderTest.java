package pr23.num2;

public class RestaurantOrderTest {
    public static void main(String[] args) {
        Item juice = new Drink(80.5, "Cool-cola", "Лучшая кола");
        Item pizza = new Dish(123.123, "Паста карбонара", "Лучшая паста для вкусного ужина!");
        Item salad = new Dish(22.8, "Салат Цезарь", "Курица, листья салата, сухарики, помидоры и секретной заправкой");
        Order orderTable1 = new Order();
        orderTable1.addItem(juice);
        orderTable1.addItem(juice);
        orderTable1.addItem(pizza);
        Order orderTable2 = new Order();
        orderTable2.addItem(juice);
        orderTable2.addItem(salad);
        orderTable1.addItem(pizza);
        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.addOrder(1, orderTable1);
        orderManager.addOrder(2, orderTable2);

        System.out.println("Столик 1 общая стоимость: $" + orderManager.getTableTotalCost(1));
        System.out.println("Столик 2 общая стоимость: $" + orderManager.getTableTotalCost(2));
    }
}
