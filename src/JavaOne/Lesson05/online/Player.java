package JavaOne.Lesson05.online;

public class Player {

        public static int countLegs = 2;

        private int health; //field's class
        private int attackPoint;
        private int positionX;
        private int positionY;
        public String name;
        public Weapon weaponPlayer;
        public Cat cat;


        public Player() {
            System.out.println("Constructor");
            weaponPlayer = new Weapon();
            weaponPlayer.name = "QWERTY";
            weaponPlayer.damage = 15.0f;
            weaponPlayer.length = 98;
            cat = new Cat("Barsik", 10);
        }

        public Player(String text) {
            System.out.println(text + " from Constructor");
        }

        public Player(int i) {
            System.out.println("This is " + i);
        }

        public Player(String name, int health, int positionX, int positionY, int attackPoint) {
            this.name = name;
            this.health = health;
            this.positionX = positionX;
            this.positionY = positionY;
            this.attackPoint = attackPoint;
        }

        public static void run() {
            System.out.println("Player run!!!");
        }

        private void speak() { //action object
            System.out.println(name + " says Hello" + countLegs);
        }

        void changePosition() {
            positionX += 1;
            positionY += 1;
            System.out.println(name + " change position to [" + positionX + ":" + positionY + "]");
        }

        void takeDamage(int valueIncomingDamage) {
            health -= valueIncomingDamage;
        }

        public class Weapon {
            String name;
            int length;
            float damage;

        }

        //getter
        public String getName() {
            return this.name;
        }

        public int getPositionX() {
            return this.positionX;
        }

        public int getAttackPoint() {
            return this.attackPoint;
        }

        //setter
        public void setHealth(int health) {
            this.health = health;
        }

        public void setAttackPoint(int attackPoint) {
            this.attackPoint = attackPoint;
        }

        public void setPositionX(int positionX) {
            this.positionX = positionX;
        }

        public void setPositionY(int positionY) {
            this.positionY = positionY;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

