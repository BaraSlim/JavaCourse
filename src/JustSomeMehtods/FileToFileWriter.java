package JustSomeMehtods;

import java.io.*;

/**
 * Считывает из файла построчно и записывает в другой
 * */

public class FileToFileWriter {

    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\com.java.course\\src\\task016\\Examples\\myTest.txt";  //путь к файлу
        String path2 = "C:\\Users\\user\\IdeaProjects\\com.java.course\\src\\task016\\Examples\\myTest2.txt";  //путь к файлу 2

        try (FileInputStream fin = new FileInputStream(path);
             FileOutputStream fos = new FileOutputStream(path2)) {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}