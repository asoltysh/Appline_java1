package Task12;

import java.util.Scanner;

public class I_like_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку (I like Java!!!): ");
        String str = scanner.nextLine();

        int chek = 0;

        if (str.contains("Java"))
            chek++;

        if (str.startsWith("I like"))
            chek++;

        if (str.endsWith("!!!"))
            chek++;

        if (chek == 3){
            System.out.println(str.toUpperCase());
        } else {
            System.out.println("Одно из условий не выполнено");
        }

        str = str.replace('a', 'o');
        System.out.println("Замена a на o в Java: " + str.substring(7, 11));
    }
}
