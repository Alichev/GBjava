package Homeworks.Homework6;

public class Notebook {
    int id;
    int ram;
    int ssd;
    String color;
    int price;

    public Notebook(int id, int ram, int ssd, String color, int price) {
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, color: %s, price: %d", id, ram, ssd, color, price);
    }

    public boolean equals(Object o) {
        Notebook t = (Notebook) o;
        return id == t.id;
    }
}
