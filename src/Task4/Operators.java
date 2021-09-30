package Task4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = scanner.nextInt();
        System.out.println("Введите число y");
        int y = scanner.nextInt();
        System.out.println("Введите число z");
        int z = scanner.nextInt();

        int sr = (x + y + z)/3;
        System.out.println("Среднее арифместическое " + x + " " + y + " " + z + " = " + sr);

        int a = sr / 2;

        if (a > 3)
            System.out.println("Программа выполнена корректно" + a);
    }
}
