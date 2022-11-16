package Final_Task;

import java.util.Scanner;

public class Currency_сonverter {
    public static void main(String[] args) {
        System.out.println("Введите курс доллара: ");
        Scanner scanner = new Scanner(System.in);
        float course = scanner.nextFloat();
        System.out.println("Введите количество рублей: ");
        int count = scanner.nextInt();

        System.out.println("- Курс доллара: " + course);
        System.out.println("- Количество рублей: " + count);

        float total = count / course;

        System.out.printf("- Итого: %.2f долларов", total);
    }
}
