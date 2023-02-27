/**Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

package Homeworks.Homework4;

import java.util.LinkedList;

public class Task01 {
    public static void main(String[] args) {
        int[] arrayList = { 12, 47, 3, 54, 20, 1 };
        LinkedList<Integer> list = new LinkedList<>();

        for (Integer temp : arrayList) {
            list.add(temp);
        }

        int temp = 0;
        while (temp != list.size() - 1) {
            list.add(list.size() - temp, list.getFirst());
            list.removeFirst();
            temp++;
        }
        System.out.println(list);
    }
}
