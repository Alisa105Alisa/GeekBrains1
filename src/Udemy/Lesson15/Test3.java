package Udemy.Lesson15;

public class Test3 {
    public static void main(String[] args) {

        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a%3 == 0 && a%7 == 0) {// а нацело делится на 3 и нацело делится на 7
                b = false;
            }
            a++;
        }

    }
}
