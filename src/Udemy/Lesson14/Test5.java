package Udemy.Lesson14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++ ) {
            if (i == 10) {continue;}// пропустит 10
            if (i == 87) {break;}// как только if будет равен 7, прервать цикл.
            System.out.println(i);
        }

    }
}
