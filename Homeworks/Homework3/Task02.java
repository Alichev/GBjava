/**Пусть дан произвольный список целых чисел. Удалить из него чётные числа.*/

package Homeworks.Homework3;

import java.util.ArrayList;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            collection.add(rnd.nextInt(0, 101));
        }
        System.out.println(collection);

        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) % 2 == 0) {
                collection.remove(i);
                i--;
            }
        }
        System.out.println(collection);
    }
}
