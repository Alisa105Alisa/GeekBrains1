package JavaOne.Lesson06.Lesson;


    public class Player extends Actor {

        public Player(String name, int health, int positionX, int positionY, int attackPoint) {
            super(name, health, attackPoint, positionX, positionY);
        }

        public void changePosition(int x, int y) {
            this.positionX = x;
            this.positionY = y;
            System.out.println(name + " change position to [" + positionX + ":" + positionY + "]");
        }

        @Override
        public void speak() {
            System.out.println("Hello i'm player");
        }

    }

