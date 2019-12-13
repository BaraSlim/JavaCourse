package finishTask001;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ввести с консоли число в бинарном формате.
 * Перевести его в десятичный формат,записать в переменную int и вывести на экран.
 * Необходимо использовать циклы, нельзя использования готовые методы языка Java,
 * для перевода числа из одной системы счисления в другую.
 */

public class finishTask001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dataArray;
        List<Integer> userArray = new ArrayList<>();
        System.out.println("Введите число в бинарном формате: ");
        String userData = scanner.nextLine();
        int[] array = new int[]{Integer.parseInt(String.valueOf(userData.split("")))};
    }
}