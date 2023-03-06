import java.util.*;

/**
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
 * 3}.
 * Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4,
 * 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
 * 3}.
 * Распечатайте содержимое данного множества.
 */

public class Task18set {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(); // можно коллекцию List.of() добавить в скобки и сразу сформируется
        // hashSet.add(1);
        // hashSet.add(2);
        // hashSet.add(3);
        // hashSet.add(2);
        // hashSet.add(4);
        // hashSet.add(5);
        // hashSet.add(6);
        // hashSet.add(3);
        hashSet.addAll(List.of(1, 2, 3, 2, 4, 5, 6, 3)); // аналог строк выше, добавит разом
        System.out.println(hashSet); // уберет повторы, вывод - не обязательно по возрастанию! только для маленьких
                                     // чисел

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(List.of(5, 1, 3, 2, 4, 3, 6, 3));
        System.out.println(linkedHashSet); // тоже уберет повторы, сохранив порядок ввода

        Set<Integer> treeSet = new TreeSet<>(List.of(5, 1, 3, 2, 4, 3, 6, 3));
        System.out.println(treeSet); // тоже уберет повторы. отсортирована по ключу (то есть выйдет по порядку)
    }
}
