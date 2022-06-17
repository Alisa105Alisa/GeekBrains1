package Udemy.Lesson12;
import Udemy.Lesson11.Student;


class StudentTest {
   public static void compareStudents (Student st1, Student st2) {
        if (st1 == st2) {
            System.out.println("Студент " + st1.name + "равен " + st2.name);
        } else
            System.out.println("Студенты не равны");
    }

    public static void comapreStudents2(Student st1, Student st2){
       if (st1.name.equals (st2.name)){
           if (st1.course == st2.course){
               if (st1.grade == st2.grade){
                   System.out.println("Имена студентов, курсы и оценки одинаковые");
               }
               else {
                   System.out.println("Имена и курсы студентов одинаковые, оценки различаются");
               }
           }
           else {
               System.out.println("Имена студентов одинаковые, оценки и курсы различаются");
           }
       }
       else {
           System.out.println("Имена студентов различаются");
       }
    }
    public static void main(String[] args) {
        Student s1 = new Student ("Иван", 2, 5.5);
        Student s2 = new Student ("Иван", 2, 6.5);
        compareStudents (s1,s2);
        comapreStudents2(s1,s2);

    }
}
