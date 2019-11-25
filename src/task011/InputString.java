package task011;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше послание ");
        String userString = scanner.nextLine();
        System.out.println("Ваше послание '" +userString+ "' отправлено");
    }
}
