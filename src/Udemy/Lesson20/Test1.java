package Udemy.Lesson20;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add ("Привет");
        Car c = new Car ();
        list.add (c);//  добавляем так в ArrayList
        Student s = new Student ();
        list.add (s);
        list.add (new StringBuilder( "ok"));
    }
}

class Car {};
class Student {}