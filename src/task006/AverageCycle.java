package task006;

import java.util.Scanner;

public class AverageCycle {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для X : ");
        x = scanner.nextInt();
        System.out.println("Введите число для Y : ");
        y = scanner.nextInt();
        System.out.println("Введите число для Z : ");
        z = scanner.nextInt();
        int average = x*y*z/3;
        System.out.println("Среднее арифметическое число = " +average);



    }
}
