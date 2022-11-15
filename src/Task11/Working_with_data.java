package Task11;

import java.util.Scanner;

public class Working_with_data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String str = scanner.next();

        System.out.println("Введите второе число:");
        int a = scanner.nextInt();

        int b = Integer.parseInt(str);

        if (b > a){
            System.out.println("Первое число больше второго:" + b);
            double c = a;
            System.out.println("Меньшее число преобразованное в double:" + c);
        } else if (b == a) {
            System.out.println("Оба числа равны");
        } else {
            System.out.println("Второе число больше первого:" + a);
            double c = Double.parseDouble(str);
            System.out.println("Меньшее число преобразованное в double:" + c);
        }
    }
}
