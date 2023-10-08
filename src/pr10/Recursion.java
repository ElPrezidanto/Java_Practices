package pr10;

import java.math.*;
import java.util.Scanner;

class Recursion {
    Recursion() {
    }

    void triangle(int k, int currentK) {
        if (currentK > k || k < 1) {
            System.out.print("\n");
            return;
        }
        for (int i = 1; i <= currentK; i++) {
            System.out.print(currentK + " ");
        }
        triangle(k, currentK + 1);

    }

    void naturals(int k, int curK) {
        if (curK > k || k < 1) {
            System.out.print("\n");
            return;
        }
        System.out.print(curK + " ");
        naturals(k, curK + 1);
    }

    void segment(int a, int b, int curNum) {

        if ((curNum > Math.max(a, b) || curNum < Math.min(a, b)) && curNum != -1) {
            System.out.print("\n");
            return;
        }
        if (a < b) {
            if (curNum == -1) {
                curNum = Math.min(a, b);
            }
            System.out.print(curNum + " ");
            segment(a, b, curNum + 1);
        }
        if (a > b) {
            if (curNum == -1) {
                curNum = Math.max(a, b);
            }
            System.out.print(curNum + " ");
            segment(a, b, curNum - 1);
        }
    }


    public static void main(String[] args) {
        Recursion t = new Recursion();
        Scanner inp = new Scanner(System.in);
        int num, num2;
        System.out.print("Введите число: ");
        num = inp.nextInt();
        t.triangle(num, 1);
        System.out.print("Введите число: ");
        num = inp.nextInt();
        t.naturals(num, 1);
        System.out.print("Введите числа a и b: ");
        num = inp.nextInt();
        num2 = inp.nextInt();
        t.segment(num, num2, -1);
    }
}