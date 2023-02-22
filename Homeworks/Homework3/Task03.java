/**Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.*/

package Homeworks.Homework3;

import java.util.ArrayList;
import java.util.Random;

public class Task03 {

    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            collection.add(rnd.nextInt(0, 21));
        }
        System.out.println(collection);
        System.out.printf("Минимальное значение: %d,\nмаксимальное значение: %d,\nсреднее арифметическое: %.1f\n",
                findMin(collection), findMax(collection), findAverage(collection));
    }

    private static Integer findMin(ArrayList<Integer> collection) {
        int min = collection.get(0);
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < min) {
                min = collection.get(i);
            }
        }
        return min;
    }

    private static Integer findMax(ArrayList<Integer> collection) {
        int max = collection.get(0);
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > max) {
                max = collection.get(i);
            }
        }
        return max;
    }

    private static Float findAverage(ArrayList<Integer> collection) {
        float sum = 0;
        for (int i = 0; i < collection.size(); i++) {
            sum += collection.get(i);
        }
        float average = sum / collection.size();
        return average;
    }
}
