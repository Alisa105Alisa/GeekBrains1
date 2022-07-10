package Udemy.Lesson27.Exceptions;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {

        int[] array = {4, 8, 1};
        System.out.println("У нас есть массив");
        try {
            System.out.println(array[5]);
            System.out.println("Всем хорошего дня!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Был пойман exception " + e);// покажет, какой именно exception
        } finally {
            System.out.println("Это блок finally");
        }

        System.out.println("Данный код не имеет отношение к исключениям");
    }
}
