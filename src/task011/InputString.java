package task011;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        String userString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше послание ");
        userString = scanner.nextLine();
        System.out.println("Ваше послание '" +userString+ "' отправлено");
    }
}
