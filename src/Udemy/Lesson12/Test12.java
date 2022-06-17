package Udemy.Lesson12;

public class Test12 {

    void maximum (int i1, int i2, int i3){
        if (i1 > i2 && i1 > i3){
            System.out.println("Максимум - " + i1);
        }
        else if (i2 > i1 && i2 > i3){
            System.out.println("Максимум - " + i2);
        }
        else
            System.out.println("Максимум - " + i3);
    }
    public static void main(String[] args) {
        Test12 t = new Test12();

        t.maximum(4, 7,0);

    }
}
