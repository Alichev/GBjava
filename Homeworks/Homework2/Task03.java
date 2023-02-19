/*В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
package Homeworks.Homework2;

public class Task03 {
    public static void main(String[] args) {
        String input = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        input = cut(input);
        String[] students = input.split(", ");
        for (String student : students) {
            student = cut(student);
            String[] keyValues = student.split(",");
            String name = "", mark = "", lesson = "";
            for (String keyValue : keyValues) {
                String[] keyValueParts = keyValue.split(":");
                String key = cut(keyValueParts[0]);
                String value = cut(keyValueParts[1]);

                if (key.equals("фамилия")) {
                    name = value;
                } else if (key.equals("оценка")) {
                    mark = value;
                } else if (key.equals("предмет")) {
                    lesson = value;
                } else {
                    throw new IllegalStateException("ОШИБКА! Непонятное значение");
                }
            }
            System.out.printf("Студент %s получил %s по предмету %s\n", name, mark, lesson);
        }
    }

    private static String cut(String str) {
        return str.substring(1, str.length() - 1);
    }
}