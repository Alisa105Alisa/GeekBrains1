package Udemy.Lesson03;

public class Lesson03 {
    public static void main(String [] args) {
        int a = 5;
        int b = a;

        int x = 1,z = 3,y = 8; //Можно объявлять переменные на 1 строке, только 1 раз написав тип данных

        int c = 3;
        int d = 10;
        int e = c + d ;
        int f = d%c; // Остаток от деления
       // System.out.println(c + d);
       // System.out.println(e); // то же, что и выше

        //Деление
        //System.out.println(d / c);
        // Т.к. у нас переменная int, будет выведена на экран целая часть. Дробная часть отсекается.
        // Не округляется!
//System.out.println(f);
int g = 10;
int h = 10;
        int i = 13 - x++;
        int j = 13 - ++x;

        System.out.println("i: " + i + ", j: " + j);

    }
}
