package pr5;

import java.util.Scanner;

public class pr5_9 {
    public static long zeros(int a, int b) {
        if (a < 0 || b < 0 || a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return zeros(a, b - 1) + zeros(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите количество нулей: ");
        int a = inp.nextInt();
        System.out.println("Введите количество единиц: ");
        int b = inp.nextInt();
        long count = zeros(a, b);
        System.out.println("Существует " + count + " последовательностей из " +
                a + " нулей и " + b + " единиц" +
                ", в которых никакие два нуля не стоят рядом.");
    }
}