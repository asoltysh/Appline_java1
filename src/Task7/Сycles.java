package Task7;

import java.util.Scanner;

public class Сycles {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String x = "1";
        String y = "a";
        String z = "abc";

        if (a <=0){
            System.out.println("Массив не может быть <= 0");
        } else {
            System.out.println("Введите данные массива:");
            String[] array = new String[a];

            for (int i = 0; i < array.length; i++) {
                //if ((x == Integer.parseInt(array[i])) || (y.equals(array[i])) || (z == array[i].charAt(0))){
                if ((x.equals(array[i])) || (y.equals(array[i])) || (z.equals(array[i]))){
                    System.out.println("Данное значение имеется в константах");
                }
            }
        }
    }
}
