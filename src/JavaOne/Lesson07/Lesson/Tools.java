package JavaOne.Lesson07.Lesson;

import java.util.Random;

public class Tools {
    public static Random random = new Random();

    public static int randomRange(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
