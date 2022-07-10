package Udemy.Lesson27.Exceptions;

import java.io.*;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("/Users/alfia/Documents/Тестирование/Java/GeekBrains/Test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман и немного обработан");
            throw e;
        } finally {

            System.out.println("Это файналли");

        }
    }

//    void def(){
//        try {
//            int [] array = {1,2,3};
//            System.out.println(array[5]);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Exception пойман и немного обработан");
//            throw e;
//        } finally {
//
//            System.out.println("Это файналли");
//
//        }
//    }
}
