package finishTask003;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Напишите программу конвертер валют.
 * Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 * (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */

//      ИСПОЛЬЗОВАН CLASS DECIMALFORMAT
public class finishTask003 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("##.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в конвертер валют RUB -> USD");
        System.out.println("Введите текущий курс USD");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Введите сумму для конвертации");
        double rubSumm = scanner.nextDouble();
        double usdAmount = rubSumm / exchangeRate;
        System.out.println("Итого за " + rubSumm + " рублей, вы получаете " + format.format(usdAmount) + " долларов");
    }
}
