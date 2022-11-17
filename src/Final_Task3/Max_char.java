package Final_Task3;

import java.util.Scanner;

public class Max_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int a = scanner.nextInt();

        String[] result = new String[a];

        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i < result.length; i++) {
            result [i] = scanner2.nextLine();
        }

        System.out.println("Количество строк: " + a);

        for (int i = 0; i < result.length; i++) {
            System.out.println("Строка " + i + ": " + result[i]);
        }

        int[] count = new int[a];

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length(); j++){
                char temp = ' ';
                for(int z = j; z < result[i].length(); z++){
                    if(result[i].charAt(j)!=result[i].charAt(z) && temp != result[i].charAt(z)){
                        temp = result[i].charAt(z);
                        count[i]++;
                    }
                }
            }
        }

        int max = 0;
        String answer = "";
        for(int i = 0; i < count.length; i++){
            if(max <= count[i]){
                max = count[i];
                answer = result[i];
            }
        }
        System.out.println("Ответ: " + answer);
    }
}
