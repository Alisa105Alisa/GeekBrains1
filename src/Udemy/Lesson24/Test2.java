package Udemy.Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
    }
}

abstract class Figura {
    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Периметр квадрата = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Площадь квадрата = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Периметр прямоугольника = " + (storona1 * 2) + (storona2 * 2));
    }

    public void ploshad() {
        System.out.println("Площадь прямоугольника = " + storona1 * storona2);
    }
}

class Okruzhnost extends Figura {
    int radius = 3;

    public void perimetr() {
        System.out.println("Периметр окружности = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Площадь окружности = " + 3.14 * radius * radius);
    }
}

abstract class Chetirehugolnic extends Figura {
    void def() {
        System.out.println("Это четырехугольник");
    }
}