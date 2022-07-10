package Udemy.Lesson22;

import javax.print.Doc;

public class Test3 {
    void uvelichenieZarplaty(Employee e) {
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Иван";
        doc.age = 50;
        doc.experience = 25;
        doc.specializaciya = "Хирург";
        doc.eat();
        doc.sleep();
        doc.heal();
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

class Doctor extends Employee {

    String specializaciya;

    void heal() {
        System.out.println("Лечить");
    }
}

class Teacher extends Employee {
    void teach() {
        System.out.println("Учить");
    }
}

class Driver extends Employee {
    void drive() {
        System.out.println("Водить");
    }
}

class Hirurg extends Doctor {
    String skalpel;

    void operaciya() {

    }
}