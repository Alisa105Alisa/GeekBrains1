package JavaOne.Lesson06.HomeWork;

public class Cat extends Animal{

    public Cat(String name, String color, int age, int maxRunLength, int maxSwimLength) {
        super(name, color, age, maxRunLength, maxSwimLength);

    }
    public void run (int runLength){
if (runLength > 200)
System.out.println(name + " can't run so far away!");
else
    System.out.println(name + " has run " + runLength + " m" );
    }


//    @Override
//    public void swim (int distance){
//        return (distance <= maxSwimLength)
//    }
}
