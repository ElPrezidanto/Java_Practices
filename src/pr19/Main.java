package pr19;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void num4() {
        TypeToArray<String> arr = new TypeToArray<>(new String[]{"1", "2", "3", "4", "5", "6"});
        arr.print(5);
    }

    private static void num3() {
        TypeToArray<Integer> arr = new TypeToArray<Integer>(new Integer[]{1, 2, 3});
        System.out.println(arr.getElemByIndex(2));
    }

    private static void num2() {
        TypeToArray<Integer> arrInt = new TypeToArray<Integer>(new Integer[]{1, 2});
        System.out.println(arrInt.getArray());
        TypeToArray<Double> arrDouble = new TypeToArray<Double>(new Double[]{1.0, 2.0});
        System.out.println(arrDouble.getArray());
    }

    private static void num1() {
        TypeToArray<String> arrStr = new TypeToArray<>(new String[]{"hello", "hi"});
        System.out.println(arrStr.getArray());
        TypeToArray<Integer> arrInt = new TypeToArray<>(new Integer[]{1, 2});
        System.out.println(arrInt.getArray());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            System.out.print("Enter number 1-4 (0 to exit)->");
            num = sc.nextInt();
            if (num == 1) num1();
            if (num == 2) num2();
            if (num == 3) num3();
            if (num == 4) num4();
        } while (num != 0);
    }
}
