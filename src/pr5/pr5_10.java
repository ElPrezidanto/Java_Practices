package pr5;

import java.util.Scanner;

public class pr5_10 {
    public static long reverse(long a, long revA) {
        if (a < 0) return 0;
        if (a == 0) return revA;
        revA = revA * 10 + a % 10;
        a /= 10;
        return reverse(a, revA);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите число: ");
        long a = inp.nextLong();
        System.out.println("Перевёрнутое число: " + reverse(a, 0));
    }
}
