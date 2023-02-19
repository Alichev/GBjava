
/**
 * Напишите метод, который принимает на вход строку (String) и определяет
 * является ли строка палиндромом (возвращает boolean значение)
 */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку для проверки: ");
        String inputString = iScanner.nextLine();
        boolean result = isPalindrome(inputString);

        if (result == true) {
            System.out.println("ЭТО ПАЛИНДРОМ");
        } else {
            System.out.println("ЭТО НЕ ПАЛИНДРОМ");
        }

        iScanner.close();
    }

    private static boolean isPalindrome(String inputString) {
        // boolean checkPalindrome = true; переменная не нужна, т.к. если в цикле
        // обнаружили, что не палиндром, - возвращаем false, в противном случае
        // возвращаем true
        for (int i = 0; i < inputString.length() - i; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
