package task006;

import java.util.Scanner;

public class AverageCycle {
    public static void main(String[] args) {
        int x, y, z, average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для X : ");
        x = scanner.nextInt();
        System.out.println("Введите число для Y : ");
        y = scanner.nextInt();
        System.out.println("Введите число для Z : ");
        z = scanner.nextInt();
        average = x * y * z / 3;
        System.out.println("Полученные цифры: \nX = " + x + "\nY = " + y + "\nZ = " + z);
        System.out.println("Среднее арифметическое число = " + average);
        if (average/2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}