package task005;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для умножения: ");
        int userNumber = sc.nextInt();
        System.out.println("Таблица умножения для числа: " + userNumber);
        MultipleMethod.multipleMethod(userNumber, i);
    }
}
