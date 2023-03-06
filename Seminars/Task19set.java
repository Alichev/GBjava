import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Напишите метод, который заполнит массив из 1000 элементов случайными числами
 * от 0 до 24.
 * Создайте метод, в который передайте заполненный выше массив, и с помощью Set
 * вычислите процент
 * уникальных значений в данном массиве, и верните его в виде числа с плавающей
 * запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее
 * количество чисел в массиве.
 */

public class Task19set {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 25);
        }
        System.out.println(calcPercent(array));
    }

    private static float calcPercent(int[] array) { // можно было выбрать тип double (он хранит 15 знаков, нам не надо
                                                    // столько, а
        // float - 7)
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            unique.add(array[i]);
        }
        return unique.size() * 100f / array.length; // эта запись означает 100 в формате float

    }
}
