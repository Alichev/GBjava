import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются
 * изоморфными и false, если нет.
 * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
 * букву во втором слове, при этом
 * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
 * порядка следования.
 * (Например, add - egg изоморфны)
 * буква может не меняться, а остаться такой же. (Например, note - code)
 */

public class Task16maps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи первую строку: ");
        String firstLine = sc.nextLine();

        System.out.println("Введи вторую строку: ");
        String secondLine = sc.nextLine();

        System.out.println(isomorphicCheck(firstLine, secondLine));
        sc.close();
    }

    private static boolean isomorphicCheck(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            if (pairs.containsKey(x.charAt(i))) {
                if (pairs.get(x.charAt(i)) != y.charAt(i)) {
                    return false;
                }
            } else {
                pairs.put(x.charAt(i), y.charAt(i));
            }
        }
        return true;
    }
}
