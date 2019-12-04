package task012;

import java.util.Scanner;

/**
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 * Результат в виде строки без пробелов вывести на экран.
 * */

public class TrimString {
    public static void main(String[] args) {
        String userString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше послание ");
        userString = scanner.nextLine().replaceAll(" ", "");;
        System.out.println("Введите Ваше послание '"+userString+"' без пробелов");
    }
}
