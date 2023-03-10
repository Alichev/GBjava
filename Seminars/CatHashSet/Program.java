/**  
 * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
 * Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. 
Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */

package CatHashSet;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Cat> myCats = new HashSet<>();
        myCats.add(new Cat("Мурзик", "Петров", "сиам", LocalDate.of(2021, 06, 11), "черный"));
        myCats.add(new Cat("Снежок", "Семенов", "беспородный", LocalDate.of(2021, 06, 11), "серый"));
        myCats.add(new Cat("Жуля", "Синеговская", "британец", LocalDate.of(2014, 07, 20), "трехцветный"));
        myCats.add(new Cat("Мурзик", "Петров", "сиам", LocalDate.of(2021, 06, 11), "черный")); // повтор, должен быть
                                                                                               // исключен при
                                                                                               // распечатке
        System.out.println(myCats);
    }
}
