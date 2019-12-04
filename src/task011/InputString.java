package task011;

import java.util.Scanner;

/**
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 * */

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше послание ");
        String userString = scanner.nextLine();
        System.out.println("Ваше послание '" +userString+ "' отправлено");
    }
}
