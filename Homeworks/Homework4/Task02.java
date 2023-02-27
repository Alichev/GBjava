/**Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */
package Homeworks.Homework4;

import java.util.LinkedList;

public class Task02 {
    public static void main(String[] args) {
        int[] arrayList = { 12, 47, 3, 54, 20, 1 };
        LinkedList<Integer> list = new LinkedList<>();

        for (Integer temp : arrayList) {
            list.add(temp);
        }

        System.out.println(list);

        enqueue(list, 111);
        System.out.println(list);

        System.out.println(dequeue(list));
        System.out.println(list);

        System.out.println(first(list));
        System.out.println(list);
    }

    private static void enqueue(LinkedList<Integer> list, int elem) {
        list.addLast(elem);
    }

    private static int dequeue(LinkedList<Integer> list) {
        int num;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    private static int first(LinkedList<Integer> list) {
        int num;
        num = list.get(0);
        return num;
    }
}
