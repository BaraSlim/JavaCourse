package task010;

import java.util.Scanner;

public class UserDataMatrix {
    public static void main(String[] args) {
        int[][] matrix;
        int matrixColumn, matrixRow;
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Предлагаем Вам создать матрицу чисел=== ");
        System.out.println("Укажите количество столбцов: ");
        matrixColumn = scanner.nextInt();
        System.out.println("Укажите количество строк:");
        matrixRow = scanner.nextInt();
        matrix = new int[matrixRow][matrixColumn];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Введите значение для " + (i + 1) + " строки и " + (j + 1) + " столбца: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Первая строка массива *3: ");
        for (int i = 0; i < matrixColumn; i++) {
            System.out.print("[" + (i + 1) + "] = " + matrix[0][i] * 3 + "\t");
        }
    }
}