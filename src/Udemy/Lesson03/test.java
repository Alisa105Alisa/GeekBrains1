package Udemy.Lesson03;

public class test {
    public static void main(String [] args) {
        int x = 10;
        int y = 13 - x++;

        System.out.println(y);

        int a = 5;
        int b = ++a - --a - a-- + a++ ;
        System.out.println(b);
    }
}
