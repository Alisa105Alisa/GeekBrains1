package Udemy.Lesson24;

public class Test5 {
}
interface I1{
    void abc();
    default void def (){
        System.out.println("this is def");
    }
}

class Z2 implements I1 {

    public void abc () {
        System.out.println("this is abc");
    }
    public static void main(String[] args) {
Z2 z = new Z2();
        z.abc();
    }

}