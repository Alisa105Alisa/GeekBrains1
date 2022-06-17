package Udemy.Lesson06.HomeWork;

public class Sum {
Sum (int a5, int b5, int c5, int d5, int e5){
    a = a5;
    b = b5;
    c = c5;
    d = d5;
    e = e5;
}
 Sum (int a4, int b4, int c4, int d4){
    this (a4, b4, c4, d4, 0); }
    Sum (int a3, int b3, int c3){
    this (a3, b3, c3, 0, 0); }
    Sum (int a2, int b2){
    this (a2, b2, 0, 0, 0);
    }
    Sum (int a1){

    this (a1, 0, 0, 0, 0);
    }
Sum (){
    this (0,0,0,0,0);
}
    int summa (){
        return  a + b + c + d + e;
    }
int a;
int b;
int c;
int d;
int e;


    public static void main(String[]args) {
Sum s1 = new Sum(6,8,1,4,5);
        System.out.println(s1.summa());
    }
}


