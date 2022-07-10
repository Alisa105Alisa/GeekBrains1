package JavaGusev.Lesson3;
import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        System.out.println(getAvg(array));
    }

    public static int getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }
}
