package JavaOne.Lesson06.HomeWork;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    private int maxRunLength;
    private int maxSwimLength;
    protected String cantSwim = "Can't swim";

    public Animal(String name, String color, int age, int maxRunLength, int maxSwimLength) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;

    }

    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }

    int getAge() {
        return this.age;
    }

    int getMaxRunLength() {
        return this.maxRunLength;
    }

    int getMaxSwimLength() {
        return this.maxSwimLength;
    }
//    int getCantSwim() {
//        return this.cantSwim;
//    }

    protected boolean run(float distance) {
        return (distance <= maxRunLength);
    }

    protected boolean swim(float distance) {
        return (distance <= maxSwimLength);
    }

}
