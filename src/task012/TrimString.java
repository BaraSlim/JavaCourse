package task012;

import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        String userString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше послание ");
        userString = scanner.nextLine().replaceAll(" ", "");;
        System.out.println("Введите Ваше послание '"+userString+"' без пробелов");
    }
}
