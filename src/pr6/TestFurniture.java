package pr6;

import java.util.Scanner;

public class TestFurniture {
    public static void main(String[] args) {
        Furniture c = new Chair(true, 9990, "Gaming Chair", 60);
        Furniture s = new Sofa(true, 9990, "Super Sofa", false);
        FurnitureShop m = new FurnitureShop();
        Furniture[] store = m.storeMas(c, s);
        int choice;
        Scanner cin = new Scanner(System.in);
        System.out.println("Добро в наш магазин Top Furninure!\n Выберите действие ниже:\n");
        do {
            m.displayMenu();
            choice = cin.nextInt();
            switch (choice) {
                case 1:
                    m.displayGoods(store);
                    break;
                case 2:
                    int ch2;
                    System.out.println("Выберите товар:");
                    m.displayGoods(store);
                    ch2 = cin.nextInt();
                    switch (ch2) {
                        case 1:
                            System.out.println(c.toString());
                            break;
                        case 2:
                            System.out.println(s.toString());
                            break;
                        default:
                            System.out.println("Такого товара нет.");
                            break;
                    }
                    break;
                case 3:
                    int ch3;
                    System.out.println("Выберите товар для покупки:");
                    m.displayGoods(store);
                    ch2 = cin.nextInt();
                    switch (ch2) {
                        case 1:
                            m.remove(store, c);
                            System.out.println("Товар " + c.getName() + " Успешно куплен!");
                            break;
                        case 2:
                            m.remove(store, s);
                            System.out.println("Товар " + s.getName() + " Успешно куплен!");
                            break;
                        default:
                            System.out.println("Такого товара нет.");
                            break;
                    }
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}