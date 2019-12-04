package task013;

import java.util.Scanner;

/**
 *      Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры
 *      и записаны в соответствующие переменные.
 *      Вывести на экран строку с наибольшей длиной.
 *      Если длины равны, вывести соответствтующее сообщение.
 * */

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку для сравнения");
        String userString1 = scanner.nextLine();
        System.out.println("Введите вторую строку для сравнения");
        String userString2 = scanner.nextLine();
        if (userString1.length() == userString2.length()) {
            System.out.println("Строки равны по длинне");
        } else if (userString1.length() < userString2.length()) {
            System.out.print("Наибольшая длинна у строки #2: '" + userString2 +"' = "+userString2.length()+" символов.");
        } else {
            System.out.print("Наибольшая длинна у строки #1: '" + userString1 +"' = "+userString1.length()+" символов.");
        }
    }
}