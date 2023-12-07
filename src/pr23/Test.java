package pr23;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Dish dish1 = new Dish(20.0, "Лучшая кола", "Cool-cola");
        Dish dish2 = new Dish(52.812, "Колбаски барбекю", "очень вкусная, с барбекю");
        Dish dish3 = new Dish(25.1, "Салат Греческий", "Салат с оливковым маслом и овощами");

        OrderManager orderManager = new OrderManager(10);
        Order order1 = new Order();
        order1.add(dish1);
        order1.add(dish2);
        orderManager.add(order1, 1);

        Order order2 = new Order();
        order2.add(dish2);
        order2.add(dish3);
        orderManager.add(order2, 3);

        orderManager.addDish(dish3, 2);

        double totalCost = orderManager.ordersCostSummary();
        System.out.println("Общая стоимость всех заказов: " + totalCost);

        int pizzaQuantity = orderManager.dishQuantity("Макароны от мамы");
        System.out.println("Количество блюда \"Макароны от мамы\" во всех заказах: " + pizzaQuantity);

        String[] dishNames = orderManager.getOrders()[1].dishesNames();
        System.out.println("Названия блюд в заказе 2: " + String.join(", ", dishNames));

        orderManager.removeOrder(2);

        int freeTable = orderManager.freeTableNumber();
        System.out.println("Номер свободного стола: " + freeTable);

        int[] freeTables = orderManager.freeTableNumbers();
        System.out.println("Свободные столы: " + Arrays.toString(freeTables));
    }
}
