package Udemy.Lesson27.Exceptions;
import java.io.*;
public class Test4_1 {
    public static void main(String[] args) {
        File f = new File ("/Users/alfia/Documents/Тестирование/Java/GeekBrains/Test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Всем хорошего дня!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Был пойман exception " + e);// покажет, какой именно exception
        }
        catch (NullPointerException e) {
            System.out.println("Был пойман exception " + e);// покажет, какой именно exception
        }
        finally {
            System.out.println("Это блок finally");
        }

        System.out.println("Данный код не имеет отношение к исключениям");
        }
    }
