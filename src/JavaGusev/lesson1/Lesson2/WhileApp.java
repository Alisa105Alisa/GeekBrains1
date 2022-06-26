package JavaGusev.lesson1.Lesson2;

public class WhileApp {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0){
            System.out.println(i);
            i--;
        }
        int j = 10;
        do { // at least once
            System.out.println("j=" + j);
            j--;
        } while (j >0);
    }
}

//Бесконечный цикл while:
 /*while (true){ // infinity
        }*/