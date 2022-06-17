package Udemy.Lesson05;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz (int skorost){// gaz - это имя метода
        speed += skorost;// увеличить на
        return speed;
    }
    int tormoz (int skorost){// tormoz - это имя метода
        speed -= skorost;// уменьшить на
        return speed;
    }
    void showInfo(){// void означает, что наш метод ничего не возвращает. Ничего не обрабатывает
        System.out.println("cvet: " + color + " motor: " + engine + "  skorost: " + speed);
    }
}

class Car2Test {
public static void main(String[]args) {
Car2 c1 = new Car2();
c1.color = "White";
c1.engine = "V6";
c1.speed = 60;

c1.showInfo();// у этого метода нет параметров
c1.gaz(20);
    c1.showInfo();// прибавили скорость и снова вывели эту информацию
    c1.tormoz(80);
    c1.showInfo();// теперь затормозили

        }
        }
