package Udemy.Lesson06;

public class MethodOverloading {
    void show (int i1){
System.out.println(i1);
    }// void - значит он ничего не возварщает, только выводит на экран

    void show (boolean b1){
        System.out.println(b1);
    }

    void show (String s1){
        System.out.println(s1);
    }

    void show (String s, int a){
        System.out.println ("String: " + s + " int: " + a);
    }

    void show (int a, String s){
        System.out.println ("Kakoy horoshiy den!!!");
    }
}

class MethodOverloadingTest {

    public static void main(String[]args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Privet!";
        mO.show(s);
        mO.show("Privet!",10);
        mO.show(7,"allo");// Java понимает, что нужно выводить соответствующий метод
    }
}
