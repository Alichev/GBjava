import java.util.ArrayList;

/**
 * Создать список типа ArrayList<String>. Поместить в него как строки, так и
 * целые числа. Пройти по списку, найти и удалить целые числа
 */
public class Task11 {
    public static void main(String[] args) {
        ArrayList mixed = new ArrayList<String>(); // стирание типов - слева не указываем тип String, можем добавлять
                                                   // все
        mixed.add(5);
        mixed.add("hello");
        mixed.add(27);
        mixed.add("pronto");
        mixed.add(28);
        mixed.add(29);
        mixed.add("yellow");
        mixed.add(0);
        System.out.println(mixed);

        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof Integer) {
                mixed.remove(i);
                i--; // костыль, т.к. если из коллекции убирается элемент, а цикл for идет по ней -
                     // происходит сдвижка
            }
        }
        System.out.println(mixed);
    }
}
