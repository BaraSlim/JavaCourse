package task018;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */

public class UserTXTRewrite {
    public static void main(String[] args) {

        /*=========================Метод перевода файта в массив построчно=========================*/
        List<String> list = new ArrayList<String>();        //список для построчной записи файла
        String path = "C:\\Users\\user\\IdeaProjects\\com.java.course\\src\\task016\\Examples\\IntelProcessor.txt";  //путь к файлу
        Scanner in = null;
        try {
            in = new Scanner(new File(path));               //построчное считывание файла в сканер
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in.hasNextLine())                           //до тех пор, пока есть, что считывать
        {
            list.add(in.nextLine());
        }
        String[] array = list.toArray(new String[0]);      //добавить(toArray) в массив array[] все считанные строки из файла list с типом String[]
        in.close();

        /*=========================Метод изменения содержимого массива=========================*/
        System.out.println("Введите номер записи для изменения: от 0 до " + array.length);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Оригинальная запись из файла = \n" + array[num] + "\n");
        System.out.println("Введите альтернативный текст для записи № " + num);
        Scanner scanner2 = new Scanner(System.in);
        String newUserString = scanner2.nextLine();
        System.out.println("Запись в файле обновлена");
        array[num] = newUserString;

        /*=========================Метод сохранения содержимого массива в файл .txt=========================*/
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < array.length; i++) {
            writer.println(array[i]);
        }
        writer.close();
        System.out.println("Спасибо! Обновленный документ доступен по адресу.\nКоличество строк в файле = " + array.length);
    }
}