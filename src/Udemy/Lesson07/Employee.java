package Udemy.Lesson07;

public class Employee {
     double salary;

     void dvoynayaZp(){
        System.out.println("Novaya z/p: " + salary*2);
    }

     Employee (double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
    }

}

class EmlployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
    }
}