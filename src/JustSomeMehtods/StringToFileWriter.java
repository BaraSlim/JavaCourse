package JustSomeMehtods;

import java.io.FileOutputStream;
import java.io.IOException;

/***
 * Перезаписывает файл с содержимым HelloWorld
 */

public class StringToFileWriter {

    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\com.java.course\\src\\task016\\Examples\\myTest.txt";  //путь к файлу

        String text = "Hello world!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream(path)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}