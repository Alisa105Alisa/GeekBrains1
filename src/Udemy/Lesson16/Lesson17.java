package Udemy.Lesson16;

public class Lesson17 {

    public void email (String s) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < s.length() - 1) {

            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
    }

    }
    public static void main(String[] args) {
        Lesson17 apk = new Lesson17();
        apk.email ("df@gmail.com; fgj@mail.ru; joy@mail.ru; swoy@yahoo.com; afonya@hotmail.com;");

    }
}
