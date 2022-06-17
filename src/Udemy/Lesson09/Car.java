package Udemy.Lesson09;

public class Car {
    String color;
    int a = 10;
    int zzzzzzzzzzzjhhhhhhhhdhddjdjdjdjdjdjdjjd = 6;// длина не ограничена
    int _alfa = 5;
    int a4 = 59;// цифра может быть не в начале
    final int XYZ = 56;// константы пишем большими буквами
    String engine; // это instance переменная. Каждый объект класса Car будет иметь эти переменные
    static int count;// это static variable. У нее самая большая область видимости

    public Car(String color, String engine){
         count++;
         int x = 5;
         int y = x + 10;// переменные х и у будут видны только внутри конструктора. Используются только внутри конструктора
         this.color = color;// this - принадлежность переменной к текущему объекту
         this.engine = engine;
    }

    public void showColor (){
        System.out.println("Цвет машиниы: " + "color");
        this.changeColor("red");
    }

    public void changeColor (String color3){ // String color3 - это parameter
        System.out.println("Цвет машины изменился");
        int cena = 5000;// это local variable
        color = color3;
        cena += 1000;
    }
}
