/* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл*/
package Homeworks.Homework2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.stream.Stream;

public class Task02 {
    private static Logger logger = Logger.getLogger(Task02.class.getName());

    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите числовой массив через запятую: ");
        String inputString = iScanner.nextLine();
        String[] inputArray = inputString.split(",");
        Integer[] inputIntArray = Stream.of(inputArray).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        System.out.println("Неотсортированный список: ");
        System.out.println(Arrays.toString(inputIntArray));

        bubbleSort(inputIntArray);
        System.out.println("Отсортированный список: ");
        System.out.println(Arrays.toString(inputIntArray));

        iScanner.close();
    }

    public static void bubbleSort(Integer[] array) throws IOException {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    FileHandler fh = new FileHandler("Homeworks/Homework2/log.xml");
                    logger.addHandler(fh);
                    XMLFormatter xml = new XMLFormatter();
                    fh.setFormatter(xml);
                    logger.setUseParentHandlers(false);
                    logger.log(Level.INFO,
                            String.format("%d <-> %d, %s", array[i], array[i + 1],
                                    Arrays.toString(array)));
                }
            }
        }
    }

}
