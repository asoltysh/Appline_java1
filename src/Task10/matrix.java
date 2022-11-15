package Task10;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");

        int a = scanner.nextInt();
        ;
        int c = scanner.nextInt();
        ;

        int[][] array = new int[a][c];

        System.out.println("Введите данные в матрицу:");
        for (int i = 0; i < a; i++) {
            for (int b = 0; b < c; b++) {
                array[i][b] = scanner.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int b = 0; b < c; b++) {
                if (i == 0) {
                    array[i][b] *= 3;
                }
                System.out.print(array[i][b] + " ");
            }
            System.out.println();
        }

        System.out.println("***");
        int ab = 3;
        switch (ab){
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
            case 2:
                System.out.println("2");
        }

    }
}
