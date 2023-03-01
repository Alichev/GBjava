
/**Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов */
package Homeworks.Homework5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Map<String, List<Integer>> phoneBook = new HashMap<>();
        phoneBook.put("Ivan", List.of(111111, 222222));
        phoneBook.put("Sergey", List.of(333333));
        phoneBook.put("Anton", List.of(444444, 555555, 666666));
        phoneBook.put("Petr", List.of(777777, 888888));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи имя: ");
        String name = sc.nextLine();

        for (Map.Entry<String, List<Integer>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(phoneBook.get(name));
            }
        }
        sc.close();
    }
}
