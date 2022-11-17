package Final_Task4;

import java.util.Scanner;

public class mystery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        String answer;
        boolean attempt;
        int count = 0;

        while (count<3) {
            answer = scanner.nextLine();
            attempt = answer.equalsIgnoreCase("Заархивированный вирус");
            if (answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Это подсказка");
                count = 2;
            }else if (attempt) {
                System.out.println("Правильно!");
                break;
            } else if (count<2){
                System.out.println("Подумай еще!");
                count++;
            }else{
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
