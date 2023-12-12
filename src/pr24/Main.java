package pr24;

public class Main {
    public static void main(String[] args) {
        InternetOrdersManager ordersManager = new InternetOrdersManager();

        Dish dish1 = new Dish(500, "Пицца Цезарь", "Итальянская кухня");
        Dish dish2 = new Dish(550, "Салат Греческий", "Новинка из салатов");
        Dish dish3 = new Dish(129, "Биг Хит", "Американская кухня");

        Drink drink1 = new Drink(200, "Бренди", "Алкогольный напиток!", 0.45, DrinkTypeEnum.BRANDY);
        Drink drink2 = new Drink(50, "Зеленый Чай", "Теплый напиток", 0.0, DrinkTypeEnum.GREEN_TEA);
        Drink drink3 = new Drink(150, "Водка", "Русская кухня", 0.5, DrinkTypeEnum.VODKA);


        Order order1 = new TableOrder();
        order1.add(dish1);
        order1.add(drink1);
        order1.setCustomer(new Customer("Наталья", "Морская-Пехота", 35, new Address()));
        ordersManager.add(order1);

        Order order2 = new TableOrder();
        order2.add(dish2);
        order2.add(dish2);
        order2.add(drink2);
        order2.setCustomer(new Customer("Степан", "Антонов", 17, new Address()));
        ordersManager.add(order2);

        Order order3 = new TableOrder();
        order3.add(dish1);
        order3.add(dish3);
        order3.add(drink3);
        order3.setCustomer(new Customer("Энрики", "Хананяев", 26, new Address()));
        ordersManager.add(order3);


        ordersManager.show();
        System.out.println();

        System.out.println("Количество Пицц в заказах: " + ordersManager.itemsQuantity("Пицца Цезарь"));
        System.out.println("Количество Зеленого Чая в заказах: " + ordersManager.itemsQuantity("Зеленый Чай"));
        System.out.println("Количество бургеров в заказах: " + ordersManager.itemsQuantity("Биг Хит"));
        System.out.println();

        System.out.println("Количество заказов: " + ordersManager.ordersQuantity());
        System.out.println("Суммарная стоимость заказов: " + ordersManager.ordersCostSummary());
        System.out.println();

        System.out.println("Удаляем Два Заказа");
        ordersManager.remove();
        ordersManager.remove();

        System.out.println("Количество заказов: " + ordersManager.ordersQuantity());
        System.out.println();

        System.out.println("Рассмотрим оставшийся заказ");
        ordersManager.show();

    }
}