package task006;

import java.util.Scanner;

/**
 *       Написать программу, которая будет выполнять следующие действия:
 *       1. Ввод трех чисел с клавиатуры x, y, z
 *       2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
 *       3. Деление среднего арифметического на 2 без остатка
 *       4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 * */

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