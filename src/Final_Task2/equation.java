package Final_Task2;

import java.util.Scanner;

public class equation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Введите простое уравнение: ");

        String str = scanner.nextLine();;

        char[] charArray = str.toCharArray();

        if (charArray[4] == 'x') {
            a = Integer.parseInt(String.valueOf(charArray[0]));
            b = Integer.parseInt(String.valueOf(charArray[2]));

            if (charArray[1] == '-') {
                System.out.println("- Ввод: " + (a - b));
            } else {
                System.out.println("- Ввод: " + (a + b));
            }
        }

        if (charArray[0] == 'x') {
            a = Integer.parseInt(String.valueOf(charArray[2]));
            b = Integer.parseInt(String.valueOf(charArray[4]));

            if (charArray[1] == '-') {
                System.out.println("- Ввод: " + (a - b));
            } else {
                System.out.println("- Ввод: " + (a + b));
            }
        }

        if (charArray[2] == 'x') {
            a = Integer.parseInt(String.valueOf(charArray[0]));
            b = Integer.parseInt(String.valueOf(charArray[4]));

            if (charArray[1] == '-') {
                System.out.println("- Ввод: " + (a - b));
            } else {
                System.out.println("- Ввод: " + (a + b));
            }
        }
    }
}