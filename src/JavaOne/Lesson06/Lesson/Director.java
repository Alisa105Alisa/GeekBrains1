package JavaOne.Lesson06.Lesson;

    public class Director {

        public static void main(String[] args) {

////        Actor actor = new Actor("Actor", 100, 0,0, 99);
//
////        Player player = new Player("Player", 100, 1, 1, 15);
////        player.speak();
//////        player.changePosition(5, 10);
//////        player.takeDamage(25);
////
////        Enemy enemy = new Enemy("EnemyGame", 5, 5, 6, 10);
//////        enemy.takeDamage(15);
////        enemy.speak();
//////        enemy.goToHome("Hello");
////
////        System.out.println("*******************");
////
        Boss boss = new Boss("Boss T1", 5, 10, 19, 852);
        boss.attack();
        boss.speak();
//
//        int abc = 5;
////        int abc = new int(5);
//        boolean myBoolean = false;
//
//        String myString = new String("Hello");
//        Player player = new Player("Player", 100, 1, 1, 15);
//
//        Object[] myArrayObjs = {abc, myBoolean, myString, player};
//
//        for (int i = 0; i < myArrayObjs.length; i++) {
//            if (myArrayObjs[i] instanceof Player) {
//                ((Player) myArrayObjs[i]).attack();
//            }
//        }
//
//        byte a = 15;
//        int result = a;
//
//        int b = 15;
//        byte result2 = (byte) b;
            int a = 15;
            int b = 20;
            int result;

//        if (a > b) {
//            result = a;
//        } else {
//            result = b;
//        }

            //тернарный оператор
            result = (a > b) ? a : b;

            System.out.println(result);

        }

    }
