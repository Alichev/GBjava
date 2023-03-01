import java.util.HashMap;
import java.util.Map;

/**
 * Создать структуру для хранения номеров паспортов и фамилий сотрудников
 * 123456 Иванов
 * 321456 Петров
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов
 */

public class Task15maps {
    public static void main(String[] args) {
        Map<Integer, String> passportToName = new HashMap<>();
        passportToName.put(123456, "Иванов");
        passportToName.put(321456, "Петров");
        passportToName.put(234561, "Петрова");
        passportToName.put(234432, "Иванов");
        passportToName.put(654321, "Петрова");
        passportToName.put(345678, "Иванов");
        System.out.println(passportToName); // выведет в случайном порядке, а если бы выбрали TreeMap - список был бы
                                            // упорядоченный по возрастанию, а если бы LinkedHashMap - то был бы
                                            // упорядочен по порядку добавления элементов
        for (Map.Entry<Integer, String> entry : passportToName.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry);
            }
        }
    }
}
