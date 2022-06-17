package Udemy.Lesson27.Exceptions;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("/Users/alfia/Documents/Тестирование/Java/GeekBrains/Test10.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);// f - файл, в который передаю информацию
        fos.write(100);// записала в файл Test10 char d
    }
}
