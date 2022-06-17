package Udemy.Lesson14;
//Вывести на экран каждую минуту времени
// 00:00;
//...
//23:59
public class Test6 {
    public void time () {
        for (int chas = 0; chas <= 23; chas++){// этов внешний for
            for (int minuta = 0; minuta <= 59; minuta++) {// это внутренний for
                System.out.println(chas + ":" + minuta);
            }
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6 ();
        t.time();
    }
}
