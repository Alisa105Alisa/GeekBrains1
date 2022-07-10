package Udemy.Lesson03;

public class test03 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 0;
        int d = 100;

        boolean e = a > b && c++ == d;

        System.out.println(e);//программа проверяет выражение до первого false
        System.out.println(c);// поэтому с++ не сработало
    }
}
