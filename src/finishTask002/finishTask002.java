package finishTask002;

import java.util.Scanner;

/**
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Пользователь программы должен задавать размер массива и наполнять его числами.
 * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */

public class finishTask002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите желаемую размерность массива: ");
        int size = input.nextInt();                     // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size];                    // Создаём массив int размером в size
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение для " + (i + 1) + " элемента массива:");
            array[i] = input.nextInt();               // Заполняем массив элементами
        }
        //      СОТРИРОВКА ПРЯМЫМ ВЫБОРОМ:
        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
        System.out.print("Отсортированный массив значений = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
