import java.util.ArrayList;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с
 * повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Юпитер");
        planets.add("Меркурий");
        planets.add("Уран");
        planets.add("Меркурий");

        ArrayList<String> uniquePlanets = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        countRepeats(planets, uniquePlanets, counts);
        printPlanetsCounts(uniquePlanets, counts);
    }

    private static void countRepeats(ArrayList<String> planets, ArrayList<String> uniquePlanets,
            ArrayList<Integer> counts) {
        for (String planet : planets) {
            int pos = uniquePlanets.indexOf(planet);
            if (pos >= 0) {
                int count = counts.get(pos) + 1;
                counts.set(pos, count);
            } else {
                uniquePlanets.add(planet);
                counts.add(1);
            }
        }
    }

    private static void printPlanetsCounts(ArrayList<String> uniquePlanets, ArrayList<Integer> counts) {
        for (int i = 0; i < uniquePlanets.size(); i++) {
            System.out.printf("Планета %-10s встречается в списке %3d раз\n",
                    uniquePlanets.get(i), counts.get(i));
        }
    }
}
