// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "cp866"); // указали кодировку, чтобы работал с русским языком (на
                                                            // ввод)
        System.out.printf("Укажите Ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name); // вместо printf можно использовать
                                                  // System.out.println(String.format("Привет, %s!", name)) (но тогда
                                                  // курсор сам перейдет, а здесь надо переводить)
        iScanner.close(); // закрыли сканнер, обратившись по имени переменной
    }
}
