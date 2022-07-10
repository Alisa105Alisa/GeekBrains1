package JavaOne.Lesson06.Lesson;


public class Boss extends Enemy {

    public Boss(String name, int health, int positionX, int positionY, int attackPoint) {
        super(name, health, positionX, positionY, attackPoint);
//        System.out.println("Constructor Boss");
    }

    @Override
    public void goToHome(String msg) {
        System.out.println(" - ");
    }

    @Override
    public void doSomething() {
        super.doSomething();
        super.attack();
        System.out.println("Boss 12345");
    }
}

