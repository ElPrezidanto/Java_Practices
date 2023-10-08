package pr11;

import java.util.Scanner;

public class TestStudent {
    public TestStudent() {
    }

    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to size array from Students");
        int size;
        size = sc.nextInt();
        Student arr = new Student(size);
        int num2;
        long val;
        int index;
        do {
            System.out.println("1 - add value to end array long int format");
            System.out.println("2 - delete value to index in array");
            System.out.println("3 - print array");
            System.out.println("4 - sort");
            System.out.println("0 - exit");
            num2 = sc.nextInt();
            if (num2 == 1) {
                System.out.println("Value ID to save");
                val = sc.nextLong();
                arr.add_value(val);
                continue;
            }
            if (num2 == 2) {
                System.out.println("Value to index delete");
                index = sc.nextInt();
                arr.del_to_index(index);
                continue;
            }
            if (num2 == 3) System.out.println(arr);
            if (num2 == 4) {
                arr.sort();
                System.out.println(arr);
            }
        } while (num2 != 0);
    }

}

