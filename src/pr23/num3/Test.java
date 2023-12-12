package pr23.num3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Cool-cola", "Лучшая кола", 20.0);
        Dish dish2 = new Dish("Макароны от мамы", "Макароны с сыром", 23.0);
        Dish dish3 = new Dish("Салат Греческий", "Салат с оливковым маслом и овощами", 25.0);

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
