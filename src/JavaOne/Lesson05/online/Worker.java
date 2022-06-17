package JavaOne.Lesson05.online;

public class Worker {
    public static void main(String[] args) {
        Player myFirstPlayer = new Player();

        System.out.println(myFirstPlayer.weaponPlayer.name);
        System.out.println(myFirstPlayer.cat.name);

        Player customPlayer = new Player("Something");

        Player object3 = new Player("NamePlayer", 220, 20, 30, 199);
        System.out.println(object3.name);
        System.out.println("After: " + object3.getName() + " " + object3.getPositionX() + " " + object3.getAttackPoint());


//        Player obj4 = new Player(65);

//        object3.health = 150;
//        object3.setHealth(150);
//        object3.attackPoint = 98;
//        object3.setAttackPoint(98);
//        object3.positionX = 5;
//        object3.setPositionX(5);
//        object3.positionY = 16;
//        object3.setPositionY(16);
//        object3.name = "Boris";
//        object3.setName("Boris");
//        System.out.println("Before: " + object3.getName() + " " + object3.getPositionX() + " " + object3.getAttackPoint());

//
//        myFirstPlayer.speak();
//        myFirstPlayer.changePosition();
//        myFirstPlayer.takeDamage(23);
//
//        System.out.println(myFirstPlayer.attackPoint);
//        System.out.println(myFirstPlayer.name + " " + myFirstPlayer.positionX);

//        Player player2 = new Player();
//
//        player2.name = "Object2";
//        player2.health = 99;
//        System.out.println(player2.name);
//        System.out.println(player2.health);

        System.out.println(Player.countLegs);
        Player.run();
    }
}

