import java.util.ArrayList;
import java.util.Random;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            collection.add(rnd.nextInt(0, 101));
        }
        System.out.println(collection);
        // collection.sort(null); // в скобках - для int по умолчанию по возрастанию. Но
        // можно написать отдельный
        // компаратор в отдельном файле
        collection.sort(new MyComparator()); // если надо по убыванию - надо в файле MyComparator поменять знаки в if
        System.out.println(collection);
    }
}
