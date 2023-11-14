package pr18;

import com.sun.jdi.IntegerValue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class Main {
    private static void num1() {
        ClsNum1<Integer, Double, Float> obj = new ClsNum1<>();
        ClsNum2<Integer, Integer, Integer, Integer> obj2 = new ClsNum2<>();
        obj.setFirst(1);
        obj.setSecond(2.0);
        obj.setThird((float) 3.0);
        System.out.println(obj.toString());
        obj2.setPole(1);
        obj2.setPole1(2);
        System.out.println(obj2.toString());
    }

    private static void num2() {
        MinMax obj = new MinMax(3, new int[]{3, -4, 8});
        System.out.println(obj.Min());
        System.out.println(obj.Max());
    }

    private static void num3() {
        System.out.println(Calculate.sum(1, 3.0));
        System.out.println(Calculate.divide(2, 1.0));
        System.out.println(Calculate.divide(2, 0.0));
        System.out.println(Calculate.divide(2, 1.0));
        System.out.println(Calculate.multiply(2.0, 1));
        System.out.println(Calculate.multiply(1, 2.0));
        System.out.println(Calculate.subtraction(1.0, 0));
    }

    private static void num4() {
        Matrix obj = new Matrix(3, 3);
        int[][] matr = new int[3][3];
        matr[0] = new int[]{1, 1, 1};
        matr[1] = new int[]{1, 1, 1};
        matr[2] = new int[]{1, 1, 1};
        obj.setArr(matr);
        System.out.println("Size of matrix is 2x2?: " + obj.checkSize(2, 2));
        System.out.println("Size of matrix is 3x3?: " + obj.checkSize(3, 3));
        int[][] arr = obj.getRes(new int[][]{{0, 0, 0}, {0, 0, 0}, {1, 1, 1}}, 3, 3);
        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("Choose the number 1-4 (0 to Exit):");
            num = sc.nextInt();
            if (num == 1) num1();
            if (num == 2) num2();
            if (num == 3) num3();
            if (num == 4) num4();
        } while (num != 0);
    }
}
