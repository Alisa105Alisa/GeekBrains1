package JavaOne.Lesson03.HomeWork;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        int[] firstArray = {1, 1, 0, 1, 1, 0, 1};
        firstArrayChanged(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println("**********");
        int[] secondArray = new int[100];
        secondArray(secondArray);
        System.out.println(Arrays.toString(secondArray));
        System.out.println("**********");
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        thirdArray(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println("**********");
        int[][] fourthArray = new int[5][5];
        fourthArray(fourthArray);
        System.out.println(Arrays.deepToString(fourthArray));
        System.out.println("**********");
        int[] fifthArray= fifthArray(6,7);
        printArray(fifthArray);

    }

    public static void firstArrayChanged(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void secondArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
    }

    public static void thirdArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
    }

    public static void fourthArray(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i] == table[j]) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }

            }
        }
    }

    public static int []fifthArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = initialValue;
        }
        return arr;
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

//    public static void printArray2(int[][] table) {
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {
//                System.out.print(table[i][j] + " ");
//            }
//        }

}






