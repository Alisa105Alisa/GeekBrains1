package Udemy.Lesson27.Exceptions;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("/Users/alfia/Documents/Тестирование/Java/GeekBrains/Test10.txt");
            System.out.println("Файл создался");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Стрим создался");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Информация читается");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("Это finally");
        }
    }
}
