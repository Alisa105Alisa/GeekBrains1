package Udemy.Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Teacher1();
       e.eat ();
    }
}
class Employee1 {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat (){
        System.out.println("Кушает работник");
    }
    void sleep (){
        System.out.println("Спать");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvouchenikov;
    void teach (){
        System.out.println("Учить");
    }
    void eat (){
        System.out.println("Кушает учитель");
    }
}
