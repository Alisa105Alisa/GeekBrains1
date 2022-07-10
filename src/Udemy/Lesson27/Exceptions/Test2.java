package Udemy.Lesson27.Exceptions;

public class Test2 {
    public static void main(String[] args) {
        int array[] = {1, 4, 0};
        System.out.println(array[5]);// ArrayIndexOutOfBoundsException выйдет
        System.out.println("hello");// это уже не выведется на экран
    }
}
