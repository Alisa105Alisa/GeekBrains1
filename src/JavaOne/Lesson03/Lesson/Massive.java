package JavaOne.Lesson03.Lesson;

import java.util.Random;

public class Massive {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] myArrayInt = new int[8];
        myArrayInt[0] = 15;
        myArrayInt[1] = 11;
        myArrayInt[2] = 16;
        myArrayInt[3] = 17;
        myArrayInt[4] = 55;
        myArrayInt[5] = 75;
        myArrayInt[6] = 45;
        myArrayInt[7] = 85;

        System.out.println(myArrayInt[4]);

        int[] bigArray = new int[59];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = randomIntRange(10, 20);
        }
        for (int i = 0; i < bigArray.length; i++) {
            System.out.print(bigArray[i] + " ");
        }

    }

    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }
}
