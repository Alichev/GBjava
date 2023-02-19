import java.io.File;

/**
 * Напишите метод, который определит тип (расширение) файлов из текущей папки и
 * выведет в консоль результат вида
 * 1 Расширение файла: txt
 * 2 Расширение файла: pdf
 * 3 Расширение файла:
 * 4 Расширение файла: jpg
 */

public class Task7 {
    public static void main(String[] args) {
        File dir = new File("."); // текущая папка. может указать путь к любой другой папке
        showExtension(dir.list());
    }

    private static void showExtension(String[] fileNames) {
        for (int i = 0; i < fileNames.length; i++) {
            int pos = fileNames[i].lastIndexOf('.'); // возвращает индекс, на котором находится последняя точка
            if (pos == -1) { // -1 - это специальное обозначение ситуации, когда симво (точка) не найден
                System.out.println(); // выведем пустую строку, если в названии файла нет точки (и нет расширения)
                continue; // не идет на следующую строку, а возвращается на следующий виток цикла
            }
            System.out.println(fileNames[i].substring(pos + 1));
        }
    }
}
