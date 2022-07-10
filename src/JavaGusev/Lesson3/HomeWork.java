package JavaGusev.Lesson3;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 1, 0, 1, 0, 1};
        zeroToOne(array);
        printArray(array);
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        printArray(array2);
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicate(array3);
        printArray(array3);
        int[][] array4 = new int[5][5];
        diogonally(array4);
        printArray2(array4);
        int[] array5 = {};

    }

    public static void zeroToOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    public static void multiplicate(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void diogonally(int[][] array4) {
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if ((i == j) || ((i + j) == array4.length - 1)) {
                    array4[i][j] = 1;
                } else {
                    array4[i][j] = 0;
                }
            }

        }
    }

   /* public static int[] definedArray(int len, int initialValue) {
        for (int i = 0; i < array.length; i++) {
             array[i] = initialValue;
        }
        return array[i];
    }*/
}



