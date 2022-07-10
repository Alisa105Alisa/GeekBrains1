package Udemy.Lesson08;

public class Car {
    String color = "blue";
    String engine = "V6";

}

class Human {
    String name = "Ivan";
    Car c = new Car();// если здесь написать final, то в дальнейшем не сможем менять инфо о машине

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car();// поменяли машину
        h1.c.engine = "V8";
    }
}
