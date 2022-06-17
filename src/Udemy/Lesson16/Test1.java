package Udemy.Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1  = new String("Привет");

        int a = s1.length();// узнаем, какая длина массива
        System.out.println(a);

        char c1 = s1.charAt(3);// узнаем, какой символ находится под 3-м индеком
        System.out.println(c1);

        int i1 = s1.indexOf('е');//узнаем, на каком индексе находится "е"
        System.out.println(i1);

        boolean i5 = s1.startsWith("При");// начинается ли i5 c "При"?
        System.out.println(i5);

        boolean b2 = s1.endsWith("вет");// заканчиватеся ли b2 "вет"?
        System.out.println(b2);


    }

    }

