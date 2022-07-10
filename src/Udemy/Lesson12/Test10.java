package Udemy.Lesson12;

import org.w3c.dom.ls.LSOutput;

public class Test10 {
    public static void main(String[] args) {
        int salary = 400;


        if (salary >= 500)
            System.out.println(":-)");
            // System.out.println("ffff");// так Java считает, что else используется без if и компилятор выдает ошибку
        else
            System.out.println(":-(");
        System.out.println("Все будет хорошо!");

    }
}

class Test11 {
    public static void main(String[] args) {
        int zarplata = 900;
        boolean b = true;

        if (zarplata < 200) {
            System.out.println("Зарплата очень низка");
        } else if (zarplata < 400 && b == false || true) {
            System.out.println("Зарплата среднего размера");
        } else if (zarplata < 600) {
            System.out.println("Зарплата высокая");
        } else
            System.out.println("Зарплата отличная");
    }
}
