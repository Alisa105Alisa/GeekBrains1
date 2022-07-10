package JavaOne.Lesson06.Lesson;

public abstract class Actor {

    protected String name;
    protected int health;
    protected int attackPoint;
    protected int positionX;
    protected int positionY;

    public Actor(String name, int health, int positionX, int positionY, int attackPoint) {
        this.name = name;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
        this.attackPoint = attackPoint;
        System.out.println("Constructor Actor");
    }

    public void takeDamage(int value) {
        health -= value;
        System.out.println(name + " take damage is " + value + ". Last health is " + health);
    }

    public void attack() {
        System.out.println(name + " has attack on " + attackPoint + " point");
    }

    public abstract void speak();

}


