import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида text~num
 * 2. Нужно рассплитить строку по ~ , сохранить текст в связный список на
 * позицию num
 * 3. Если введено print~num,выводит строку из позиции num в связном списке и
 * удаляет ее из списка
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введи текст в виде text/num (для выхода введи q): ");
        Scanner sc = new Scanner(System.in);
        String listText = sc.nextLine();
        String[] listTextArray = listText.split("/");
        LinkedList<String> list = new LinkedList<>();

        while (!listTextArray[0].equals("q")) {
            listText = listTextArray[0];
            int textPos = Integer.parseInt(listTextArray[1]);
            if (listText.equals("print")) {
                System.out.println(list.get(textPos));
                list.remove(textPos);
                System.out.println(list);
            } else {
                list.add(textPos, listText);
                System.out.println(list);
            }
            System.out.println("Введи текст в виде text/num (для выхода введи q): ");
            listText = sc.nextLine();
            listTextArray = listText.split("/");
        }

        System.out.println(list);
        sc.close();
    }
}
