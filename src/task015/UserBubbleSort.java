package task015;

import java.util.Scanner;

public class UserBubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите желаемую размерность массива: ");
        int size = input.nextInt();                     // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size];                    // Создаём массив int размером в size
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение для " + (i + 1) + " элемента массива:");
            array[i] = input.nextInt();               // Заполняем массив элементами
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.print("Отсортированный массив значений = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);

        }
    }
}