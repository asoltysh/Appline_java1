package Task13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class latin_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        int sum = 0;

        String[] result = str.split("[а-яА-Я0-9]+");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            sum++;
        }
        System.out.println();
        System.out.println("Количество слов на латинице: " + sum);
    }
}
