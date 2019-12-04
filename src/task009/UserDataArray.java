package task009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *      Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 *      где каждый элемент массива умножается на 2.
 *      Размер массива задается пользователем.
 * */

public class UserDataArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userArray = new ArrayList<>();
        System.out.println("Введите размер массива: ");
        int userData = scanner.nextInt();
        for (int i = 1; i <userData+1; i++) {
            System.out.println("Введите " + i + " элемент массива: ");
            userArray.add(scanner.nextInt());
        }
        for (int i = 0; i <userArray.size() ; i++) {
            System.out.println("Элемент #"+i+"x2 ="+userArray.get(i)*2);
        }
    }
}