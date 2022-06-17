package Udemy.Lesson22;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test5 {

}

class Human3 {
        Human3 (String name, String surname) {
   this.name = name;
   this.surname = surname;
    }

    String name;
    String surname;
}

class Student3 extends Human3 {
    int course;
    Student3 (String name, String surname, int course){
        super (name, surname);
        this.course = course;
    }

    public static void main(String[] args) {
        Student3 s = new Student3("Коля", "Иванов", 3);
        System.out.println(s.course);
    }
}