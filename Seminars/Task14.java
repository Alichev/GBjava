import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и "запоминает" строки
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была
 * первой в списке, а первая - последней
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти
 */
public class Task14 {
    public static void main(String[] args) {
        // System.out.println("Введи строку или команду: ");
        Scanner sc = new Scanner(System.in);
        String inputString = "";
        Deque<String> list = new ArrayDeque<>();

        while (!inputString.equalsIgnoreCase("q")) {
            System.out.println("Введи строку или команду: ");
            inputString = sc.nextLine();

            if (inputString.equalsIgnoreCase("print")) {
                System.out.println(list);
            } else if (inputString.equalsIgnoreCase("revert")) {
                list.pop();
                System.out.println(list);
            } else {
                list.push(inputString);
                // System.out.println(list);
            }
        }

        System.out.println(list);
        sc.close();
    }
}
