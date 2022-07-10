package JavaOne.Lesson06.Lesson;


public class Enemy extends Actor {

    private int enemyValue;
    private String name;

    public Enemy(String name, int health, int positionX, int positionY, int attackPoint) {
        super(name, health, attackPoint, positionX, positionY);
//        System.out.println("Constructor Enemy");
        this.name = name;
    }

    public Enemy(String name, int health, int positionX, int positionY, int attackPoint, int value) {
        super(name, health, positionX, positionY, attackPoint);
        this.enemyValue = value;
    }

    public void goToHome(String value) {
        if (health < 10) {
            System.out.println(name + " run out battle");
        }
        System.out.println(value);
    }

    public void doSomething() {
        System.out.println(name + " do Something");
    }

    @Override
    public void speak() {
        System.out.println("Hello i'm enemy");
    }
}

