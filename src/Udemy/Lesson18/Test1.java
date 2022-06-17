package Udemy.Lesson18;

public class Test1 {
    public static void main(String[] args) {
        int [] array1;// это declaration массива. Он пока ни на что не ссылается
        String [] array2;
        double [][] array3;
        int[][] array10;

        array1 = new int [8];//задан одномерный массив длиной 8
        array2 = new String[2];
        array3 = new double[4][2];// 4 одномерных масива длиной 2
        array10 = new int[3][];// 3 одномерных массива разной длины, поэтому второе [] пустое

        System.out.println(array2.length);

        array2[0] = "Привет";
        array2[1] = "Пока";
        array2[2] = "ок";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double [] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;

    }
}
