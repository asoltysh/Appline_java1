package Task14;

import java.util.Random;
import java.util.Scanner;

public class massive_with_random_value {
    public static void main(String[] args) {

        System.out.println("Массив из случайных элементов (от -20 до 20): ");
        Random random = new Random();
        int minimum = -20;
        int maximum = 20;

        int max = 0;
        int min = 0;

        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = (int) (Math.random() * (maximum + Math.abs(minimum) + 1)) - maximum;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Максимальный эелемент массива: " + max);
        System.out.println("Минимальный эелемент массива: " + min);

        if (max > Math.abs(min)){
            System.out.println("Максимальный эелемент массива по модулю: " + max);
        } else {
            System.out.println("Максимальный эелемент массива по модулю: " + min);
        }
    }
}
