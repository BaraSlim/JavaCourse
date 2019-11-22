package task004;
import java.util.Scanner;

public class BinaryReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        //Инициировать объект класса Scanner
        System.out.println("Введите число в бинарном формате: ");   //Предложение к действию
        String bin = sc.nextLine();                                 //Получаем введенное число из консоли
        int binNum = Integer.parseInt(bin, 2);                //Перевод bin в десят. формат
        System.out.println(binNum);                                 //Вывод результата на экран
    }
}