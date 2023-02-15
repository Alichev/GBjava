// Вывести все простые числа от 1 до 1000

package Homeworks.Homework1;

public class Task02 {
    public static void main(String[] args) {
        int max = 1000;
        for (int i = 2; i < max; i++) {
            boolean check = true;
            int root = (int) Math.sqrt(i);
            for (int j = 2; j <= root; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
