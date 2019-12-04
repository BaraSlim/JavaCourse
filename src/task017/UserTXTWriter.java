package task017;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *      Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 *      Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании
 *      программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.
 * */

public class UserTXTWriter {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\com.java.course\\src\\task016\\Examples\\myTest.txt"; //путь к файлу
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));           //чтение с консоли
        System.out.println("Введите данные для записи в файл:");                        //предложение к действию
        System.out.println("Для остановки записи - в новой строке введите 'стоп'");     //правило остановки записи

        try (OutputStream output = Files.newOutputStream(Paths.get(path),   //output - объект потока. Files - класс для открытия файла с путем к файлу
                StandardOpenOption.APPEND,                                  //настройка записи в конец файла
                StandardOpenOption.CREATE);                                 //настройка создания файла, при его отсутствии
             BufferedOutputStream outputStream = new BufferedOutputStream(output)) { // буфферизованный поток записи в файл output
            String line;
            while (!"стоп".equalsIgnoreCase(line = reader.readLine())) {      //пока строка не будет равна rw, записывать в поток
                outputStream.write(System.lineSeparator().getBytes());
                outputStream.write(line.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

