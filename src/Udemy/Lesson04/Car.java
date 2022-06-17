package Udemy.Lesson04;

public class Car {
    Car (String cvet, String motor){
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color + " Мотор машины: " + engine);
    }
    String color;
    String  engine;
}

class CarTest {
    public static void main(String[]args) {
        Car car1 = new Car("yellow", "v4");
        Car car2 = new Car("white", "v6");

    }
}
