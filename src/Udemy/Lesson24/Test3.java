package Udemy.Lesson24;

import Udemy.Lesson10.Homework.p4.p5.E;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();// водитель - это способный помогать
        Employee e = new Driver();//обращаемся только к тем методам Driver, которые есть в Employee
        h.pomosh();
        h.tushitPozhar("вода");
    }
}


class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}


class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;

    void teach() {
        System.out.println("Учить");
    }

    public void pomosh() {
        System.out.println("Учитель оказывает помощь");
    }

    public void tushitPozhar(String s) {
        System.out.println("Учитель тушит пожар с помощью " + s);
    }

}


class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashiny;

    void drive() {
        System.out.println("Водить");
    }

    public void pomosh() {
        System.out.println("Водитель оказывает помощь");
    }

    public void tushitPozhar(String s) {
        System.out.println("Водитель тушит пожар с помощью " + s);
    }

    public void swim() {
        System.out.println("Водитель может плавать");
    }
}

interface Help_able {
    void pomosh();

    void tushitPozhar(String predmet);
}

interface Swim_able {
    void swim();
}

