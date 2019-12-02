package task018;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Введите номер записи для изменения: от 0 до "+array.length);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Оригинальная запись из файла = \n"+array[num]);
        System.out.println("Введите альтернативный текст для записи № " + num);
        String newUserString = scanner.nextLine();
        System.out.println("Альтернативная запись = \n" + newUserString);
        array[num]=newUserString;

        /*=========================Метод сохранения содержимого массива в файл .txt=========================*/

        try (OutputStream output = Files.newOutputStream(Paths.get(path),  StandardOpenOption.CREATE_NEW);
             BufferedOutputStream outputStream = new BufferedOutputStream(output)) {
            for (int i = 0; i < array.length ; i++) {
                outputStream.write(array[i].getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//    Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
//        а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
//        Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.