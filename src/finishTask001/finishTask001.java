package finishTask001;

import java.util.Scanner;

/**
 * Ввести с консоли число в бинарном формате.
 * Перевести его в десятичный формат,записать в переменную int и вывести на экран.
 * Необходимо использовать циклы, нельзя использования готовые методы языка Java,
 * для перевода числа из одной системы счисления в другую.
 */

public class finishTask001 {
    public static void main(String[] args) {
        int userDataInDex = 0;
        System.out.println("Введите число в бинарном формате: ");
        String userDataReverse = String.valueOf(new StringBuffer(new Scanner(System.in).nextLine()).reverse());
        int[] userDataMass = new int[userDataReverse.length()];
        for (int i = 0; i < userDataReverse.length(); i++) {
            userDataMass[i] = (int) (Integer.parseInt(String.valueOf(userDataReverse.charAt(i))) * Math.pow(2, i));
        }
        for (int i = 0; i < userDataMass.length; i++) {
            userDataInDex = userDataInDex + userDataMass[i];
        }
        System.out.println("Число в десятичном формате = " + userDataInDex);
    }
}