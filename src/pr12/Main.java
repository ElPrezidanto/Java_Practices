package pr12;

import java.util.Scanner;

public class Main {
    private static void num1() {
        Scanner sc = new Scanner(System.in);
        String n1, n2, data;
        System.out.println("First player name");
        n1 = sc.nextLine();
        System.out.println("Second player name");
        n2 = sc.nextLine();
        System.out.println("Input to data in format xxxxx xxxxx");
        data = sc.nextLine();
        GameNum1 obj = new GameNum1(n1, n2, data);
        obj.start();
    }

    private static void num2() {
        Scanner sc = new Scanner(System.in);
        String n1, n2, data;
        System.out.println("First player name");
        n1 = sc.nextLine();
        System.out.println("Second player name");
        n2 = sc.nextLine();
        System.out.println("Input to data in format xxxxx xxxxx");
        data = sc.nextLine();
        GameNum2 obj = new GameNum2(n1, n2, data);
        obj.start();
    }

    private static void num3() {
        Scanner sc = new Scanner(System.in);
        String n1, n2, data;
        System.out.println("First player name");
        n1 = sc.nextLine();
        System.out.println("Second player name");
        n2 = sc.nextLine();
        System.out.println("Input to data in format xxxxx xxxxx");
        data = sc.nextLine();
        GameNum3 obj = new GameNum3(n1, n2, data);
        obj.start();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            System.out.print("Number:\n1. stack\n2. DoubleList\n3. DequeList\n0. exit -> ");
            num = sc.nextInt();
            if (num == 1) num1();
            if (num == 2) num2();
            if (num == 3) num3();
        } while (num != 0);
    }
}
