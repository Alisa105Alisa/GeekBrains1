package Udemy.Lesson03;

public class HomeWork {
    public static void main(String [] args) {
        int a = 5;
        int b = a-- - --a + ++a + a++ + a;
        System.out.println(b);

        int c = 8;
        int d = ++c - c++ + ++c - --c;
        System.out.println(d);


    }
}
