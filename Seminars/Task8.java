// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

public class Task8 {
    public static void main(String[] args) {
        String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        // if (s1 == s2) {
        // System.out.println("Равны как ссылки"); // равны как ссылки (т.к. Java при
        // повторении объекта ("Hello") создает его 1 раз и делает на него ссылку)
        // } else {
        // System.out.println("Не равны как ссылки");
        // }

        // if (s1.equals(s2)) {
        // System.out.println("Равны как значения"); // равны как значения
        // } else {
        // System.out.println("Не равны как значения");
        // }

        // if (s1 == s3) {
        // System.out.println("Равны как ссылки"); // равны как ссылки, т.к. ведут на
        // один объект
        // } else {
        // System.out.println("Не равны как ссылки");
        // }

        // if (s1.equals(s3)) {
        // System.out.println("Равны как значения"); // равны как значения
        // } else {
        // System.out.println("Не равны как значения");
        // }

        // if (s1 == s4) {
        // System.out.println("Равны как ссылки"); // равны как ссылки, т.к. состоит из
        // констант и компилятор видит,
        // // что это тот же объект, и создает на него новую ссылку
        // } else {
        // System.out.println("Не равны как ссылки");
        // }

        // if (s1.equals(s4)) {
        // System.out.println("Равны как значения"); // равны как значения
        // } else {
        // System.out.println("Не равны как значения");
        // }

        // if (s1 == s5) {
        // System.out.println("Равны как ссылки");
        // } else {
        // System.out.println("Не равны как ссылки"); // не равны как ссылки, т.к.
        // создает новую строку (на это указывает new)
        // }

        // if (s1.equals(s5)) {
        // System.out.println("Равны как значения"); // равны как значения
        // } else {
        // System.out.println("Не равны как значения");
        // }

        if (s1 == s6) {
            System.out.println("Равны как ссылки");
        } else {
            System.out.println("Не равны как ссылки"); // не равны как ссылки, т.к. создает новую строку (на это
                                                       // указывает new)
        }

        if (s1.equals(s6)) {
            System.out.println("Равны как значения"); // равны как значения
        } else {
            System.out.println("Не равны как значения");
        }
    }
}
