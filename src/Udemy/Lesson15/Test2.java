package Udemy.Lesson15;

public class Test2 {
    public static void main(String[] args) {

        int money = 100;
        while (money > 0) {
            System.out.println("Делать ставку");
            System.out.println("Вы проиграли");
            money = money - 10;
        }
    }
}