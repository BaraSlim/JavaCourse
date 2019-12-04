package task014;

import java.util.Scanner;

/**
 *      Необходимо написать программу, которая будет реализовывать следующие действия:
 *      1. Ввод числа с клавиатуры и запись его в строковую переменную S
 *      2. Конвертация строковой переменной S в числовую переменную X типа int
 *      3. Конвертация числа X типа int в число Y типа double
 *      Все три числа разных типов необходимо в столбик вывести на экран
 * */


public class StringConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число для конвертации: ");
        String S = scanner.nextLine();
        int X = Integer.parseInt(S);
        double Y = Double.valueOf(X);
        System.out.println("\n Строковая переменная = "+S+"\n Числовая переменная = "+X+"\n Число с двойной точностью = "+Y);

    }
}
