package Udemy.Lesson11;

public class Car {
    String color;
    String engine;
    int doorQuantity;

    Car (String color, String engine, int doorQuantity){
        this.color = color;
        this.engine = engine;
        this.doorQuantity = doorQuantity;
    }

    public int doors (){
        doorQuantity = doorQuantity * 2;
        return doorQuantity;
    }

}

 class CarTest {
     public static void main(String[] args) {
         Car Car1 = new Car ("red", "V12", 3);
         Car Car2 = new Car ("white","V6", 5);
         System.out.println(Car1.doorQuantity);
         Car1.doors();
         System.out.println(Car1.doorQuantity);
     }
}