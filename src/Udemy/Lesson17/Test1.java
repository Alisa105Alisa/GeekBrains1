package Udemy.Lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good");
        StringBuilder sb3 = new StringBuilder(50);// вместимомть 16 символов
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb3.length());

        sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);// изменяет сам StringBuilder, добавляя к нему значения

        System.out.println(sb2.insert(4, 55));// на 4 позицию пишу "55"

        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6);
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);
        StringBuilder sb12 = new StringBuilder("Всем привет");
        sb12.replace(0, 5, "Пете ");
        System.out.println(sb12);
        System.out.println(sb12.capacity());

    }
}
