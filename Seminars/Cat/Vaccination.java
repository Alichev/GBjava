package Cat;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private String producer;
    private String name;

    public Vaccination(LocalDate date, String producer, String name) { // создаем конструктор (у него нет типа возврата)
                                                                       // для инициализации стартовых значений полей.
                                                                       // Чтобы создать его автоматически - лампочка на
                                                                       // имя класса и "generate constructors"
        this.date = date; // полю присваиваем аргумент (this - служебное слово, указывает на поле в этой
                          // локации)
        this.producer = producer;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    // public void setDate(LocalDate date) { // дата не меняется никогда, т.е.
    // узнать дату можно, а изменить нельзя
    // this.date = date;
    // }

    @Override
    public String toString() {
        return "Vaccination [date=" + date + ", producer=" + producer + ", name=" + name + "]"; // формат распечатки
                                                                                                // задаем, можем править
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

}
