package JavaOne.Lesson07.Lesson;

public class Enemy {

    private int health;
    private int attackPoint;

    private int valueMin = 5;
    private int valueMax = 10;

    public Enemy() {
        this.health = Tools.randomRange(valueMin, valueMax);
        this.attackPoint = Tools.randomRange(valueMin, valueMax);
    }

    public void decreaseHealth(int value) {
        this.health -= value;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPoint() {
        return attackPoint;
    }
}
