package JavaOne.Lesson03.online;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.08.2021
 */

public class Letter {

    //    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] myArrayInt = new int[5]; //неявное создание массива
        int[] myCustomArray = {10, 15, 20, 25, 30, 35}; //явное создание
//
//        myArrayInt[0] = 15;
//        myArrayInt[1] = 20;
//        myArrayInt[2] = -5;
//        myArrayInt[3] = 0;
//        myArrayInt[4] = 12;

//        System.out.println(myArrayInt[4] + " " + myArrayInt[2]);

//        int[] bigArray = new int[78];
//
//        for (int i = 0; i < bigArray.length; i++) {
//            bigArray[i] = randomIntRange(10, 20);
//        }
//
//        for (int i = 0; i < bigArray.length; i++) {
//            System.out.print(bigArray[i] + " ");
//        }

//        String[] catsArray = new String[10];
//        String[] dogArray = new String[20];
//
//        fillArray(catsArray);
//        fillArray(dogArray);
//
//        printArray(catsArray);
//        printArray(dogArray);


//        printArray(returnRandomArray(10, 5, 15));
//
//        printArray(returnRandomArray1(10, 50, 75));

//        int[][] myArray2 = new int[4][6];
//        int count = 0;
//
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                myArray2[i][j] = count;
//                count++;
//            }
//        }
//
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                System.out.print(myArray2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        createRandom2Massive(10,10);

        int[][][] myArray3 = new int[1][2][3];

        int count3 = 0;

        for (int i = 0; i < myArray3.length; i++) {
            for (int j = 0; j < myArray3[i].length; j++) {
                for (int k = 0; k < myArray3[i][j].length; k++) {
                    myArray3[i][j][k] = count3;
                    count3++;
                }
            }
        }

        int[][][][][][][][][][] myArray10 = new int[1][2][3][4][5][6][7][8][9][10];


//        greetingsUser("Boris");
//        greetingsUser("Boris", "Anatoljevich");
//        greetingsUser("Boris", "Anatoljevich", "Filatov");

//        System.out.println("Result name: " + greetingUser("Enter your name"));
//        System.out.println(random.nextInt()); //[-int;+int]
//        System.out.println(random.nextFloat());//[0;1)
//        System.out.println(random.nextDouble());
//        System.out.println(random.nextInt(100)); //(0;100]

//        System.out.println("Number: " + randomIntRange(-75, -50));

//        for (int i = 0; i < 10; i++) {
//            System.out.print(randomIntRange(-75, -50) + " ");
//        }
//        System.out.println("Result: " + randomString(15));
    }

    public static void createRandom2Massive(int width, int height) {
        String[][] table = new String[height][width];

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                table[y][x] = "[" + y + ";" + x + "]";
            }
        }

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                System.out.print(table[y][x] + "\t");
            }
            System.out.println();
        }

    }


    public static String[] returnRandomArray(int size, int min, int max) {
        String[] tmpArray = new String[size];

        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = randomString(randomIntRange(min, max));
        }
        return tmpArray;
    }

    public static int[] returnRandomArray1(int size, int min, int max) {
        int[] tmpArray = new int[size];

        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = randomIntRange(min, max);
        }
        return tmpArray;
    }


    public static void fillArray(String[] inputString) {

        for (int i = 0; i < inputString.length; i++) {
            inputString[i] = randomString(10);
        }
    }

    public static void fillArray(int[] inputString) {

        for (int i = 0; i < inputString.length; i++) {
            inputString[i] = randomIntRange(10, 20);
        }
    }

    public static void printArray(String[] inputStringArray) {
        for (int i = 0; i < inputStringArray.length; i++) {
            System.out.print(inputStringArray[i] + "\t");
        }
        System.out.println();
    }

    public static void printArray(int[] inputStringArray) {
        for (int i = 0; i < inputStringArray.length; i++) {
            System.out.print(inputStringArray[i] + "\t");
        }
        System.out.println();
    }

//    public static void greetingsUser(String userName) {
//        System.out.println("Hello user, " + userName);
//    }
//
//    public static void greetingsUser(String name, String secondName) {
//        System.out.println("Hello user, " + name + " " + secondName);
//    }
//
//    public static void greetingsUser(String name, String secondName, String surname) {
//        System.out.println("Hello user, " + name + " " + secondName + " " + surname);
//    }


    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }

    public static String randomString(int value) {
        String string = "";

        for (int i = 0; i < value; i++) {
            int valueAscii = randomIntRange(80, 120);
            char tmpChar = (char) valueAscii;
            string += tmpChar;
        }
        return string;
    }

//    public static String greetingUser(String msg) {
//        System.out.print(msg + ": ");
//        return scanner.next();
//    }

}
