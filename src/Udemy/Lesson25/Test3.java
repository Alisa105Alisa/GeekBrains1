package Udemy.Lesson25;

import javax.print.Doc;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
        Employee1 emp4 = new Employee1();
        Employee1[] array = {emp1, emp2, emp3, emp4};
        for (Employee1 e : array) {
            if (e instanceof Driver1) {
                System.out.println(((Driver1) e).nazvanieMashiny);
                ((Driver1) e).drive();
            }
        }
        // Doctor1 d1 = (Doctor1)emp1;// это casting
        System.out.println(((Doctor1) emp1).specializaciya);// emp1, чувствуй себя, как доктор
        ((Doctor1) emp1).heal();
    }
}

class Employee1 {
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

class Doctor1 extends Employee1 {
    String specializaciya = "Хирург";

    void heal() {
        System.out.println("Лечить");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver1 extends Employee1 {
    String nazvanieMashiny = "Mercedes";

    void drive() {
        System.out.println("Водить");
    }
}

