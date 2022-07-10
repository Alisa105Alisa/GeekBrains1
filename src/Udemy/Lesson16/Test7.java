package Udemy.Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Урааааа!!!";
        String s3 = s1.concat(s2).trim().replace("Урааааа!!!", "Ура!").substring(6, 10);
        System.out.println(s1.substring(s1.indexOf('w')));

    }
}
