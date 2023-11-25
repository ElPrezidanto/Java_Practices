package pr22;

import java.util.Scanner;

public class ComplexTest {
    private final static Scanner scanner = new Scanner(System.in);
    private final static ConcreteFactory ComplexFactory = new ConcreteFactory();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Желаете создать конкретное комплЕксное число?");
            System.out.println("1. Да");
            System.out.println("2. Нет");
            System.out.println("3. Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Действительная часть: ");
                    int real = scanner.nextInt();

                    System.out.print("Мнимая часть: ");
                    int imagine = scanner.nextInt();

                    Complex complexNumber = ComplexFactory.createComplex(real, imagine);

                    System.out.println(complexNumber);
                    break;
                }
                case 2: {
                    Complex complexNumber = ComplexFactory.createComplex();

                    System.out.println(complexNumber);
                    break;
                }
                case 3: {
                    return;
                }
            }
        }
    }
}

