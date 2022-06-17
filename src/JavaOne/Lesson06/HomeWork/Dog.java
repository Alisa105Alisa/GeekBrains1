package JavaOne.Lesson06.HomeWork;

public class Dog extends Animal{


    public Dog(String name, String color, int age, int maxRunLength, int maxSwimLength) {
       super(name, color, age, maxRunLength, maxSwimLength);

    }

    public void run (int runLength){
        if (runLength > 500)
            System.out.println(name + " can't run so far away!");
        else
            System.out.println(name + " has run " + runLength + " m" );
    }

    public void swim (int swimLength){
        if (swimLength > 10)
            System.out.println(name + " can't swim so far away!");
        else
            System.out.println(name + " has swam " + swimLength + " m" );
    }
}
