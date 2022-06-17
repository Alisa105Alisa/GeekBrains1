package Udemy.Lesson12;

import javax.imageio.stream.ImageInputStream;

public class Test13 {

    void abc(){
        String str;
        int a = 10;
        if (a >= 10){
            str = "Привет";
        }
        if (a < 10) {
            str = "Пока";
        }
        else
            str = null;
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a:b;// это тернарный оператор
        System.out.println(maximum);

    }

}
