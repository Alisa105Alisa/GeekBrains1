package Udemy.Lesson27.Exceptions;

import java.io.*;

public class Test8 {
    static int abc() {
        int a = 5;
        try {
            File f = new File("/Users/alfia/Documents/Тестирование/Java/GeekBrains/Test11.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман");
            System.out.println("Переменная а в catch блоке = " + a);
            return a;
        } finally {
            a = 10;
            System.out.println("Это файналли");
            System.out.println("Переменная а в finally блоке = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
