package Udemy.Lesson08;


public class Student {
    String name;
    int course;
    static int count; //чтобы эта переменная принадлежала всему классу

    public Student(String name2, int course2) {  //создаем конструктор
        count++; //считаем кол-во созданных студентов
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");// будем видеть, что создан студент
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov " + count);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(st1.name);
        System.out.println(Student.count);// увидим кол-во созданных студентов. Пишем вначале
        //student, тк count был создан в другом классе
        showCount();
    }
}





