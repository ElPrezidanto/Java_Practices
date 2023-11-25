package pr22;

import java.util.Scanner;

public class ChairTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ChairFactory chairFactory = new ChairFactory();
    private static final Client client = new Client();

    public static void main(String[] args) {
        while (true) {

            System.out.println("Какой стул хотите создать?");
            System.out.println("1. Викторианский");
            System.out.println("2. Магический");
            System.out.println("3. Функциональный");
            System.out.println("0. Выход");
            System.out.print("Номер команды: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    VictorianChair chair = chairFactory.createVictorianChair();
                    client.setChair(chair);
                    client.sit();
                    break;
                }
                case 2: {
                    MagicChair chair = chairFactory.createMagicChair();
                    client.setChair(chair);
                    client.sit();
                    break;
                }
                case 3: {
                    FunctionalChair chair = chairFactory.createFunctionalChair();
                    client.setChair(chair);
                    client.sit();
                    break;
                }
                case 0: {
                    return;
                }
            }
        }
    }
}
