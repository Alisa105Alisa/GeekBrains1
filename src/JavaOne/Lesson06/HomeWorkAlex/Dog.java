package JavaOne.Lesson06.HomeWorkAlex;

public class Dog extends Animal {

    public static int countDog = 0;

    Dog(String name, float maxJump, float maxRun, float maxSwim) {
        super("Пес", name, maxJump, maxRun, maxSwim);
        ++countDog;
    }


}
