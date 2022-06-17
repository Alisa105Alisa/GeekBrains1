package Udemy.Lesson16;

public class Car {
    String color;
    String engine;

    Car (String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;

    public Car abc (String cvet){
        Car c10 = new Car (cvet, "V4");
        return c10;


    }
}

class TestCar {
    final static Car c = new Car ("Красный", "V8");
}