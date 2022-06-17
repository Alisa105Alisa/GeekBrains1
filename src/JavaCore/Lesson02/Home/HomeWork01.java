package JavaCore.Lesson02.Home;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        String[][] goodArray = {
                {"0","12", "2", "44",},
                {"1","15", "7", "12",},
                {"5","12", "9", "10",},
                {"8","17", "5", "24",},
        };

        String[][] badArray1 = new String[2][5];

        String[][] badArray2 = {
                {"0","12", "2", "44",},
                {"1","15", "coucou", "12",},
                {"5","12", "9", "10",},
                {"8","17", "5", "24",},
        };

        String[][] myArray = new String[4][4];

//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = 0; j < myArray[i].length; j++) {
//                myArray[i][j] = j + 1;
//            }
//        }
        System.out.println(Arrays.deepToString(myArray));
//        try {
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                    myArray[i][j] = j + 1;
//                }
//            }
//            System.out.println(Arrays.deepToString(myArray));
//        } catch (ArrayIndexOutOfBoundsException е) {
//            System.out.println("Ошибка индексации массива: " + е);
//        }
    }
}


