
package Cat;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat {
    private String name;
    private String owner;
    private String breed;
    private LocalDate bitrhDate;
    private String color;
    private ArrayList<Vaccination> vaccinations = new ArrayList<>(); // создали пустой список прививок (отдельно
                                                                     // инициализируем)

    public Cat(String name, String owner, String breed, LocalDate bitrhDate, String color) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.bitrhDate = bitrhDate;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getBitrhDate() {
        return bitrhDate;
    }

    public String getColor() {
        return color;
    }

    public void addVaccination(Vaccination vaccination) { // можем добавлять в коллекцию прививок (а удалять нельзя)
        vaccinations.add(vaccination);
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", bitrhDate=" + bitrhDate + ", color="
                + color + ", vaccination=" + vaccinations + "]";
    }

}
