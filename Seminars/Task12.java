import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 */

public class Task12 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integerArrayList.add((int) (Math.random() * 100));
        }
        System.out.println("Заполнение ArrayList заняло " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            integerLinkedList.add((int) (Math.random() * 100));
        }
        System.out.println("Заполнение LinkedList заняло " + (System.currentTimeMillis() - time));
    }
}
