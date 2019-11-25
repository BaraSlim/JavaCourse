package task014;

import java.util.Scanner;

public class StringConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число для конвертации: ");
        String S = scanner.nextLine();
        int X = Integer.parseInt(S);
        double Y = Double.valueOf(X);
        System.out.println("\n Строковая переменная = "+S+"\n Числовая переменная = "+X+"\n Число с двойной точностью = "+Y);

    }
}
