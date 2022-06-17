package Udemy.Lesson23;

public class Test2 {
    //public Object abc (){return new Doctor ();}

    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher ();
//        Driver dr = new Driver ();
//        Employee e = new Employee();
//        Hirurg x = new Hirurg ();

        Employee emp1 = new Doctor ();//employee может ссылаться на дочерний объект
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1. age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();

        Employee emp2 = new Teacher ();// учитель - это работник
        Employee emp3 = new Driver ();

        Doctor d2 = new Hirurg ();
        Employee emp4 = new Hirurg();
    }
}
class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat (){
        System.out.println("Кушать");
    }
    void sleep (){
        System.out.println("Спать");
    }
}

class Doctor extends Employee {
    String specializaciya;
    void heal (){
        System.out.println("Лечить");
    }
}

class Teacher extends Employee {
    int kolichestvouchenikov;
    void teach (){
        System.out.println("Учить");
    }
}

class Driver extends Employee {
    String nazvanieMashiny;
    void drive (){
        System.out.println("Водить");
    }
}


class Hirurg extends Doctor {
    String skalpel;

    void operaciya() {

    }
}
