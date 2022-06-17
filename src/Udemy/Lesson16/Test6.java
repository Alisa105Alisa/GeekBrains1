package Udemy.Lesson16;

public class Test6 {
    public static void main(String[] args) {
        String s = "Привет";

        String s2 = s.toLowerCase();// делает все буквы маленькими
        System.out.println(s2);

        String s3 = s.toUpperCase();// делает все буквы большими
        System.out.println(s3);

        boolean b = s.contains("е");
        System.out.println(b);
    }
}
