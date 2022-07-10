package Udemy.Lesson08.Homework;

public class Umnozenie {

    static int umnozh(int a, int b, int c) {
        return a * b * c;
    }

    static int delenie(int a, int b) {
        return a / b;
    }

}

class UmnozenieTest {
    public static void main(String[] args) {
        System.out.println(Umnozenie.umnozh(10, 5, 2));
    }
}
