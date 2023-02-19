/* В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
Значения null не включаются в запрос*/
package Homeworks.Homework2;

public class Task01 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";
        input = input.substring(1, input.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM students WHERE ");

        String[] parts = input.split(",");
        boolean isFirst = true;
        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0];
            key = key.substring(1, key.length() - 1);
            String value = keyValue[1];

            if (value.equals("\"null\"")) {
                continue;
            }
            if (!isFirst) {
                sb.append(" AND ");
            }
            sb.append(String.format("%s = %s", key, value));
            isFirst = false;
        }
        System.out.println(sb);
    }
}
