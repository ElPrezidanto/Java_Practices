package pr5;

import java.util.Scanner;

public class pr5_8 {
    public static String palindrom(String a) {
        if (a.charAt(0) != a.charAt(a.length() - 1)) return "NO";
        if (a.length() > 2) {
            return palindrom(a.substring(1, a.length() - 1));
        } else
            return "YES";
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = inp.nextLine();
        System.out.println(palindrom(a));
    }
}
