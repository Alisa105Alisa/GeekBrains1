package Udemy.Lesson22.p1;
import Udemy.Lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c= new Chelovek ("male");
        c.setName ("Коля");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
