// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Homeworks.Homework1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = iScanner.nextInt();
        int triangleNum = (n * (n + 1)) / 2;
        System.out.printf("Треугольное число: %d\n", triangleNum);
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.printf("Факториал: %d", factorial);
        iScanner.close();
    }
}
