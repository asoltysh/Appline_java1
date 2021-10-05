package Task6;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a = scanner.nextInt();
        int b;
        float kolvo;

        float mg = 0;
        float g = 0;
        float kg = 0;
        float t = 0;

        double m = 0;
        double mil = 0;
        double yard = 0;
        double foot = 0;

        if (a == 1){
            System.out.println("Выберите единицу измерения: 1 - миллиграмм, 2 - грамм, 3 - килограмм, 4 - тонна");
            b = scanner.nextInt();
            System.out.println("Введите количество выбранных единиц");
            kolvo = scanner.nextInt();
            switch (b){
                case 1:
                    System.out.println("Результат: ");
                    mg = kolvo;
                    System.out.println("Миллиграммы: " + mg);
                    g = kolvo * 1000;
                    System.out.println("Граммы: " + g);
                    kg = kolvo * 1000000;
                    System.out.println("Килограммы: " + kg);
                    t = kolvo * 1000000000;
                    System.out.println("Тонны: " + t);
                    break;
                case 2:
                    System.out.println("Результат: ");
                    mg = kolvo / 1000;
                    System.out.println("Миллиграммы: " + mg);
                    g = kolvo;
                    System.out.println("Граммы: " + g);
                    kg = kolvo * 1000;
                    System.out.println("Килограммы: " + kg);
                    t = kolvo * 1000000;
                    System.out.println("Тонны: " + t);
                    break;
                case 3:
                    System.out.println("Результат: ");
                    mg = kolvo / 1000000;
                    System.out.println("Миллиграммы: " + mg);
                    g = kolvo / 1000;
                    System.out.println("Граммы: " + g);
                    kg = kolvo;
                    System.out.println("Килограммы: " + kg);
                    t = kolvo * 1000;
                    System.out.println("Тонны: " + t);
                    break;
                case 4:
                    System.out.println("Результат: ");
                    mg = kolvo / 1000000000;
                    System.out.println("Миллиграммы: " + mg);
                    g = kolvo / 1000000;
                    System.out.println("Граммы: " + g);
                    kg = kolvo / 1000;
                    System.out.println("Килограммы: " + kg);
                    t = kolvo;
                    System.out.println("Тонны: " + t);
                    break;
            }

        } else if (a == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            b = scanner.nextInt();
            System.out.println("Введите количество выбранных единиц");
            kolvo = scanner.nextInt();
            switch (b){
                case 1:
                    System.out.println("Результат: ");
                    m = kolvo;
                    System.out.println("Метры: " + m);
                    mil = kolvo / 1609;
                    System.out.print("Мили: ");
                    System.out.printf("%.3f\n",mil);
                    yard = kolvo * 1.094;
                    System.out.print("Ярды: ");
                    System.out.printf("%.3f\n",yard);
                    foot = kolvo * 3.281;
                    System.out.print("Футы: ");
                    System.out.printf("%.3f\n",foot);
                    break;
                case 2:
                    System.out.println("Результат: ");
                    m =  kolvo * 1609;
                    System.out.println("Метры: " + m);
                    mil = kolvo;
                    System.out.print("Мили: ");
                    System.out.printf("%.3f\n",mil);
                    yard = kolvo / 1760;
                    System.out.print("Ярды: ");
                    System.out.printf("%.3f\n",yard);
                    foot = kolvo / 5280;
                    System.out.print("Футы: ");
                    System.out.printf("%.3f\n",foot);
                    break;
                case 3:
                    System.out.println("Результат: ");
                    m =  kolvo / 1.094;
                    System.out.print("Метры: ");
                    System.out.printf("%.3f\n",m);
                    mil = kolvo / 1760;
                    System.out.print("Мили: ");
                    System.out.printf("%.3f\n",mil);
                    yard = kolvo;
                    System.out.print("Ярды: ");
                    System.out.printf("%.3f\n",yard);
                    foot = kolvo * 3;
                    System.out.print("Футы: ");
                    System.out.printf("%.3f\n",foot);
                    break;
                case 4:
                    System.out.println("Результат: ");
                    m =  kolvo / 3.281;
                    System.out.print("Метры: ");
                    System.out.printf("%.3f\n",m);
                    mil = kolvo / 5280;
                    System.out.print("Мили: ");
                    System.out.printf("%.3f\n",mil);
                    yard = kolvo / 3;
                    System.out.print("Ярды: ");
                    System.out.printf("%.3f\n",yard);
                    foot = kolvo;
                    System.out.print("Футы: ");
                    System.out.printf("%.3f\n",foot);
                    break;
            }
        }
    }
}
