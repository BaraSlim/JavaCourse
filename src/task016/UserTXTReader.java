package task016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *       Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 **/

public class UserTXTReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\com.java.course\\src\\task016\\Examples\\myTest.txt";  //путь к файлу
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {        //считывать построчно, пока не закончится файл
                System.out.println(line);                   //каждый раз выводить строчку с полученными из файла данными
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода информации " + exc);
        }
    }
}