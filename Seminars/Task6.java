import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String inputString = iScanner.nextLine();
        System.out.println(repeatString(inputString));
        writeString(repeatString(inputString));
        iScanner.close();
    }

    private static String repeatString(String part) {
        StringBuilder fullMaker = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            fullMaker.append(part);
        }
        return fullMaker.toString();
    }

    private static void writeString(String string) {
        FileWriter file = null;
        try {
            file = new FileWriter("test.txt");
            file.append(string);
            System.out.println("Файл создан");

        } catch (IOException ex) {
            System.err.printf("Ошибка %s", ex);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex2) {
                    System.err.printf("Ошибка %s", ex2);
                }
            }
        }
    }
}
