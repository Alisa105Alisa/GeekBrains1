package Udemy.Lesson27.Exceptions;

public class Test5 {
    static void abc() {
        System.out.println("работет метод abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println(" Error is catched");
        }

    }
}
