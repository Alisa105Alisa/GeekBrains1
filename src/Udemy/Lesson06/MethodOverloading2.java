package Udemy.Lesson06;

public class MethodOverloading2 {
    public int sum (int i1, int i2){
        return i1 + i2;
    }


    protected String sum(String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloading2Test {
    public static void main(String[]args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(6,9);
        System.out.println(a);
        String s = mO2.sum("Privet,","kak dela");
        System.out.println(s);
    }
}
