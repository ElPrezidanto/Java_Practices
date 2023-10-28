package pr13;

import java.io.*;
import java.util.Scanner;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        String fileName3 = "file3.txt";
        String fileName4 = "file4.txt";
        writeToFile(fileName1);
        readFromFile(fileName2);
        replaceInFile(fileName3);
        appendToFile(fileName4);
    }

    public static void writeToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            System.out.println("Введите текст для записи в файл(для завершения ввода введите '0'):");
            Scanner inp = new Scanner(System.in);
            String text;
            do {
                text = inp.nextLine();
                if (!text.equals("0"))
                    writer.write(text + "\n");
            } while (!text.equals("0"));

            System.out.println("Данные записаны в файл.");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        System.out.println("\nЧтение из файла ");
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void replaceInFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            System.out.println("\nВведите новый текст для замены в файле (для завершения ввода введите '0'):");
            Scanner inp = new Scanner(System.in);
            String text;
            do {
                text = inp.nextLine();
                if (!text.equals("0"))
                    writer.write(text + "\n");
            } while (!text.equals("0"));
            System.out.println("Данные заменены в файле.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void appendToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            System.out.println("\nВведите текст для записи в файл(для завершения ввода введите '0'):");
            Scanner inp = new Scanner(System.in);
            String text;
            do {
                text = inp.nextLine();
                if (!text.equals("0"))
                    writer.write(text + "\n");
            } while (!text.equals("0"));
            System.out.println("Данные добавлены в конец файла.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
