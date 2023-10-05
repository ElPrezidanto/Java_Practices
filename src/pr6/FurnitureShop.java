package pr6;

import java.util.Scanner;

public class FurnitureShop {


    public Furniture[] storeMas(Furniture c, Furniture s) {
        Furniture[] store = new Furniture[2];
        store[0] = c;
        store[1] = s;
        return store;
    }

    public void remove(Furniture[] store, Furniture c) {
        for (int i = 0; i < 2; i++) {
            if (store[i] == c) store[i] = null;
        }
    }

    public void displayGoods(Furniture[] store) {
        int l = store.length;
        for (int i = 0; i < l; i++) {
            if (store[i]!=null) System.out.println((i+1) + ". " + store[i].getName());
        }
        System.out.println("-----------------------");
    }

    public void displayMenu() {
        System.out.println("1. показать товары в наличии\n" +
                "2. узнать характеристики товара\n" +
                "3. купить товар\n" +
                "4. выйти из меню\n");
    }


}
