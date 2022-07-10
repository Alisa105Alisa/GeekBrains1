package Udemy.Lesson09;

public class Student {

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();// началась жизнь объекта st1
        Student st2 = new Student();
        Student st3;
        st1 = null;// это значит, что объект может быть удален. Он пригоден для удаления сборщиком мусора
    }
}
