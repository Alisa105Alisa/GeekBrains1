package Udemy.Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able h = new Teacher();
        Employee[] array4 = {emp1, emp2, emp3};
        String s1 = null;
//
//        for (Employee emp:array4) {
//            emp.work();
//        }
        System.out.println(emp1 instanceof Teacher);
        Driver[] array1 = {new Driver(), new Driver()};
        Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        emp1.work();
        emp2.work();
        emp3.work();
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {
    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {
    public void help() {
        System.out.println("Driver helps");
    }

    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {
    public void help() {
        System.out.println("Doctor helps");
    }

    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}

