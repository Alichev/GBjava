/**  1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java. */

package Cat;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination(LocalDate.of(2023, 2, 28), "Umbrella", "Popicat");
        // System.out.println(vaccination); // можем распечатать просто, т.к. сделали
        // toString
        // System.out.println(vaccination.getDate()); // получили доступ к одному полю
        // vaccination.setDate(LocalDate.of(2023, 03, 05)); // установили новую дату

        Cat cat = new Cat("Барсик", "Иван", "перс", LocalDate.of(2005, 10, 25), "рыжий");
        System.out.println(cat);
        cat.addVaccination(vaccination);
        cat.addVaccination(new Vaccination(LocalDate.of(2023, 1, 7), "Pfizer", "Allergana"));
        System.out.println(cat);
    }
}
