package pr17;

import java.util.Scanner;

public class Main {
    private static void num2() {
        LabClassUI lab = new LabClassUI();
        lab.start();
    }

    private static void num1() {
        InnValidator val = new InnValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ИНН: ");
        String innToCheck = sc.nextLine(); //667204591180
        try {
            if (val.isValidInn(innToCheck)) {
                System.out.println("Номер ИНН действителен.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            num = sc.nextInt();
            switch (num) {
                case 1 -> num1();
                case 2 -> num2();
            }
        } while (num != 0);
    }
}
