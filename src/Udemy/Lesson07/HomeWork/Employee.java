package Udemy.Lesson07.HomeWork;

public class Employee {
    Employee(int id2, String surname2, int age2) { // существующий работник
        this(id2, surname2, age2, 0.0, null);//для вызова конструктора внутри конструктора. Какой именно - Java обнаруживает по параметрам и типам данных
        // this должно быть на первой строке, потом все остальное
    }

    public Employee(String surname3, int age3) { // новый кандидат, которого еще не приняли
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) { // более сложный работник, прописываем конструктор для него
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    int age;
    public String surname;
    private double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 25);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(45, "Alekseev", 25, 45000, "accounting");
        System.out.println(emp3.surname);

    }
}
