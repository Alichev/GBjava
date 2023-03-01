/**Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности */

package Homeworks.Homework5;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        List<String> personnel = List.of("Петр", "Петр", "Антон", "Иван", "Антон", "Петр", "Сергей", "Илья", "Петр",
                "Сергей", "Иван", "Иван");
        System.out.println(repeat(personnel));
    }

    private static Map<String, Integer> repeat(List<String> personnel) {
        Map<String, Integer> nameCounter = new LinkedHashMap<>();

        for (int i = 0; i < personnel.size(); i++) {
            if (nameCounter.containsKey(personnel.get(i))) {
                nameCounter.put(personnel.get(i), nameCounter.get(personnel.get(i)) + 1);
            } else {
                nameCounter.put(personnel.get(i), 1);
            }
        }

        Map<String, Integer> sortedMap = nameCounter.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }
}
