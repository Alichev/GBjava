
// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

package Homeworks.Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = iScanner.nextInt();
        System.out.println("Введите желаемое действие:\n 1 это +\n 2 это -\n 3 это *\n 4 это /");
        int oper = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = iScanner.nextInt();
        int result = 0;
        if (oper == 1) {
            result = firstNumber + secondNumber;
            System.out.printf("%d + %d = %d", firstNumber, secondNumber, result);
        } else if (oper == 2) {
            result = firstNumber - secondNumber;
            System.out.printf("%d - %d = %d", firstNumber, secondNumber, result);
        } else if (oper == 3) {
            result = firstNumber * secondNumber;
            System.out.printf("%d * %d = %d", firstNumber, secondNumber, result);
        } else if (oper == 4) {
            result = firstNumber / secondNumber;
            System.out.printf("%d / %d = %d", firstNumber, secondNumber, result);
        } else {
            System.out.println("ОШИБКА");
        }
        iScanner.close();
    }
}
