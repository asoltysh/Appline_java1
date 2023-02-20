package AdvancedTask1;

import java.util.Scanner;

/**
 * @author ASoltysh
 * @see #sum(double, double)
 * @see #minus(double, double)
 * @see #multiplication(double, double)
 * @see #division(double, double)
 */

public class Calculated {

    /**
     * Метод для сложения переменных в калькуляторе
     * @param c
     * @param d
     */
    public static void  sum(double c, double d) {
        double result = c + d;
        System.out.printf("Результат: %.4f", result);
    }

    /**
     * Метод для вычитания переменных в калькуляторе
     * @param c
     * @param d
     */
    public static void  minus(double c, double d) {
        double result = c - d;
        System.out.printf("Результат: %.4f", result);
    }

    /**
     * Метод для деления переменных в калькуляторе
     * @param c
     * @param d
     */
    public static void  multiplication(double c, double d) {
        double result = c / d;
        System.out.printf("Результат: %.4f", result);
    }

    /**
     * Метод для умножения переменных в калькуляторе
     * @param c
     * @param d
     */
    public static void  division(double c, double d) {
        double result = c * d;
        System.out.printf("Результат: %.4f", result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую переменную: ");
        double a = scanner.nextDouble();

        System.out.println("Введите вторую переменную: ");
        double b = scanner.nextDouble();

        System.out.println("Введите операцию: + - * /");
        char c = scanner.next().charAt(0);

        switch (c) {
            case '+':
                sum(a,b);
                break;
            case '-':
                minus(a,b);
                break;
            case '*':
                division(a,b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    multiplication(a,b);
                }
                break;
        }
    }
}
