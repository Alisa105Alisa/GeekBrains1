package Udemy.Lesson27.Exceptions;
import java.io.*;
public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File ("/Users/alfia/Documents/Тестирование/Java/GeekBrains/Test9.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println(" Пойман exception 1");
        }
        catch (NullPointerException e){
            System.out.println(" Пойман exception 2");
        }
    }
}
