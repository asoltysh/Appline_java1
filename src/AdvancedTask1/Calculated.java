package AdvancedTask1;

import java.util.Scanner;

public class Calculated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую переменную: ");
        double a = scanner.nextDouble();

        System.out.println("Введите вторую переменную: ");
        double b = scanner.nextDouble();

        System.out.println(a + " " + b);
    }
}
