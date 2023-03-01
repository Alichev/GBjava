import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Написать метод, определяющий правильность расстановки скобок в выражении */
public class Task17map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи выражение со скобками: ");
        String inputFormula = sc.nextLine();

        System.out.println(isValid(inputFormula));
        sc.close();
    }

    private static boolean isValid(String formula) {
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        Map<Character, Character> bracketsDict = new HashMap<>();
        bracketsDict.put('(', ')');
        bracketsDict.put('{', '}');
        bracketsDict.put('[', ']');
        bracketsDict.put('<', '>');

        for (char c : formula.toCharArray()) {
            if (bracketsDict.containsKey(c)) { // если c является открывающей скобкой
                brackets.add(c);
            } else if (bracketsDict.containsValue(c)) { // если с является закрывающей скобкой
                if (brackets.isEmpty())
                    return false;
                char openingBracket = brackets.removeLast();
                if (bracketsDict.get(openingBracket) != c) { // если открывающая скобка (последняя) не соответствует
                                                             // открывающей
                    return false;
                }
            }
        }
        if (brackets.isEmpty()) {
            return true;
        } else {
            return false; // более короткая запись без условия: return brackets.isEmpty(); - вернет true
                          // для правдивого выражения и false для ложного
        }
    }
}
