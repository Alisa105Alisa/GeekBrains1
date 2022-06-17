package Udemy.Lesson05;

public class Employee {
    Employee (int id2, int age2, String surname2, int salary2, String department2) {
  id = id2;
  age = age2;
  surname = surname2;
  salary = salary2;
  department = department2;
    }
        int id;
        int age;
        String surname;
        int salary;
        String department;


    double uvelichenieZarplaty(){
        salary *= 2;
        return salary;
    }
    void employeeInfo(){
        System.out.println("Surname: " + surname + " Salary: " + salary );
    }
}

 class EmployeeTest {

     public static void main(String[]args) {
         Employee John = new Employee(3,38,"Golt", 100000, "Logistics");
         John.employeeInfo();
         John.uvelichenieZarplaty();
         John.employeeInfo();
         Employee Saly = new Employee(4, 45, "Smith", 50000, "Accounting");
         Saly.employeeInfo();
         Saly.uvelichenieZarplaty();
         Saly.employeeInfo();
     }

}
