package Udemy.Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
        t.sleep();
        Employee2 e = new Teacher2();


    }
}

class Employee2 {
    double salary = 100;
    String name;
    void eat (){
        System.out.println("Кушает работник");
    }
    private void sleep (){
        System.out.println("Спит работник");
    }
}

class Teacher2 extends Employee2 {
    int kolichestvouchenikov;
    void teach (){
        System.out.println("Учить");
    }
    @Override
    void eat (){
        System.out.println("Кушает учитель");
    }
    public void sleep (){
        System.out.println("Спит учитель");
    }
}