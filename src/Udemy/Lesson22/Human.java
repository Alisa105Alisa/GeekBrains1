package Udemy.Lesson22;

public class Human {

   private String name = "Коля";
    public String getName (){
        return name;
    }
    public void setName (String n){
        name = n;
    }
    public static int salary = 150;
    public void work (){
        System.out.println("Работать");
    }
    public static void rest (){
        System.out.println("Отдыхать");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
//        System.out.println(Student.salary);
//        s.work();
//        Student.rest();
    }
}