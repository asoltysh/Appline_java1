package Task5;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();

        System.out.println("Введите операцию: + - * /");
        char c = scanner.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0){
                    System.out.println("нельзя делить на 0");
                } else {
                    System.out.println(a / b);
                }
                break;
        }
    }
}
