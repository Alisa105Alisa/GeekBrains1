package Udemy.Lesson16;

public class Test2 {

    public static void main(String[] args) {
        String s1 = new String("elefant");

        String s10 = s1.substring(3);// начиная с 3 символа присвой
        System.out.println(s10);

        String s12 = s1.trim();
        System.out.println(s12);

        String s14 = s1.replace('b', 'z');
        System.out.println(s14);

        String s15 = s1.replace("ele", "sele");// заменить часть слова
        System.out.println(s15);

        String s5 = "Привет,";
        String s6 = "Друг";
        String s7 = s5.concat(s6);// сконкатенировать
        System.out.println(s7);
    }
}
