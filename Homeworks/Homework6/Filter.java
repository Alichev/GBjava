package Homeworks.Homework6;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Notebook n1 = new Notebook(1, 8, 512, "red", 1200);
        Notebook n2 = new Notebook(2, 8, 256, "black", 1450);
        Notebook n3 = new Notebook(3, 32, 128, "grey", 1880);

        System.out.println("Выберите вариант сортировки:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по цене");
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();

        if (choice == 1) {
            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if (ram >= 32) {
                System.out.printf(n3.toString() + "\n");
            } else if (ram < 32) {
                System.out.printf(n1.toString() + "\n" + n2.toString() + "\n");
            } else
                System.out.println("Таких ноутбуков нет!");

        } else if (choice == 2) {

            System.out.printf("Введите ориентировочную цену: ");
            Integer price = sc.nextInt();
            if (price >= 1000 && price <= 2000) {
                System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n3.toString() + "\n");
            } else
                System.out.println("Таких ноутбуков нет!");
        }
        sc.close();
    }
}
