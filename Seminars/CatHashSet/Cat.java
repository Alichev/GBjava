
package CatHashSet;

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
                + color + ", vaccination=" + vaccinations + "]\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        result = prime * result + ((bitrhDate == null) ? 0 : bitrhDate.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((vaccinations == null) ? 0 : vaccinations.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (breed == null) {
            if (other.breed != null)
                return false;
        } else if (!breed.equals(other.breed))
            return false;
        if (bitrhDate == null) {
            if (other.bitrhDate != null)
                return false;
        } else if (!bitrhDate.equals(other.bitrhDate))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (vaccinations == null) {
            if (other.vaccinations != null)
                return false;
        } else if (!vaccinations.equals(other.vaccinations))
            return false;
        return true;
    }

}
