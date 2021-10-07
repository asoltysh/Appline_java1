package Task8;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;

        if (a <=0){
            System.out.println("Число не положительное");
        } else {
            for (int i = 0; i <= a; i++){
                if (i % 2 == 1){
                    sum += i;
                }
            }
        }
    }
}
