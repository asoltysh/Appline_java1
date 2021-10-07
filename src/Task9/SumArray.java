package Task9;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        double sum = 0;
        double sr = 0;

        if (a <=0){
            System.out.println("Массив не может быть <= 0");
        } else {
            System.out.println("Введите данные массива:");
            Double[] array = new Double[a];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextDouble();
                sum += array[i];
            }

            sr = sum / 3;

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] * sr);
            }
        }
    }
}
