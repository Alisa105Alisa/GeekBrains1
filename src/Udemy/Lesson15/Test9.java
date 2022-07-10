package Udemy.Lesson15;

public class Test9 {
    public static void main(String[] args) {
        int chas = -1;
        OUTER:
        do {
            chas++;
            int minuta = 0;

            INNER:
            while (minuta < 60) {
                if (minuta == 20) {
                    continue OUTER;
                }// пропустит 20
                System.out.println(chas + ":" + minuta);
                minuta++;
            }


        } while (chas < 24);
    }
}
